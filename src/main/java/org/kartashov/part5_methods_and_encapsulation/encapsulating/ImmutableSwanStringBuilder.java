package org.kartashov.part5_methods_and_encapsulation.encapsulating;

/**
 * Created by Serhii K. on 10/20/2015.
 */
public class ImmutableSwanStringBuilder {

    private StringBuilder builder;

    public ImmutableSwanStringBuilder(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    // return immutable object
    public String getValue() {
        return builder.toString();
    }
}
