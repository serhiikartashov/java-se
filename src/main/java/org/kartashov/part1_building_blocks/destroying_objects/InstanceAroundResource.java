package org.kartashov.part1_building_blocks.destroying_objects;

import java.lang.ref.Cleaner;

/**
 * 1. Every field in this class is final. It doesn't mean that it is immutable because fields are only references to
 *      (maybe) mutable objects but still it reduces amount of mental energy we have to invest in code analysis.
 *      Also you will not find any getters/setters in this class!
 *
 * 2. Access to resource is encapsulated through class implementing Runnable. This class will be registered in
 *      Cleaner mechanism. Notice that it is private class because there is no need to expose it outside.
 *      It is also static to not make reference to external AutoCloseable class.
 *
 * 3. We have two fields, both of them will be initialised in the constructor but neither is a direct mirror
 *      of a value passed to the constructor.
 *
 * 4. So here in constructor we have only an indicator how to create resource and whole procedure is fully
 *      encapsulated - no info is revealed that we are using Cleaner!!!
 *
 * 5. Only this part is a public API - it is part of public contract called AutoCloseable.
 */
public class InstanceAroundResource implements AutoCloseable {
    // we will delegate cleaning to Cleaner from java 9
    private static final Cleaner cleaner = Cleaner.create();

    //static to not have reference to external instance
    private static class EncapsulatedResource implements Runnable {

        String handleToSystemResource; //don't need to be private because EncapsulatedResource is private

        EncapsulatedResource(String handleTosystemResource) {
            this.handleToSystemResource = handleTosystemResource;
        }

        @Override
        public void run() {
            System.out.println("Closing system resource by cleaner :" + handleToSystemResource);
            handleToSystemResource = "CLOSED";
        }
    }

    // no getters for those two fields
    private final EncapsulatedResource state;
    private final Cleaner.Cleanable cleanable;

    public InstanceAroundResource(String resourceId) {
        this.state = new EncapsulatedResource("[opened :" + resourceId + "]");
        this.cleanable = cleaner.register(this, state);
    }

    // here we are connecting Cleaner with AutoCloseable from Java7
    @Override
    public void close() {
        System.out.println("First In Auto-Closable");
        cleanable.clean();
    }

    public static void main(String[] args) {
        //1
        try (var r = new InstanceAroundResource("BLOG-POST")) {
            System.out.println("Using resource1");
        }

        //2
        new InstanceAroundResource("UNHANDLED-RESOURCE");
        System.out.println("r2 left alone");
        System.gc();

//        try (var r = new InstanceAroundResource("Java10")) {
//            System.out.println("Doing something in java 10");
//        }
    }
}
