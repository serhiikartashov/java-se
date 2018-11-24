package org.kartashov.part6_class_design.interface_impl;

/**
 * Created by Serhii K. on 10/27/2015.
 */
public interface IsWarmBlooded {

    boolean hasScales();

    public default double getTemperature(){
        return 10.0;
    }

    default double getTemperature1(){
        return 10.0;
    }
}
