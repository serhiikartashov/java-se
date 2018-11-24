package org.kartashov.part6_class_design.interface_impl;

/**
 * Created by Serhii K. on 10/27/2015.
 */
public abstract interface Definition {

    public static final int MINIMUM_DEPTH = 2;

    public abstract int getMaximumDepth();
}

class FieldMouse implements Definition {
    public int getMaximumDepth() {
        return 10;
    }
}

// final and private not allowed
/*
private final interface CanCrawl {  // DOES NOT COMPILE
    // only public methods
    */
/*private void dig(int depth);  // DOES NOT COMPILE
    protected abstract double depth();  // DOES NOT COMPILE*//*

    // not allowed final
    */
/*public final void surface();  // DOES NOT COMPILE*//*

}*/
