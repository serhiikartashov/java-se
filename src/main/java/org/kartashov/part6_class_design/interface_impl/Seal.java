package org.kartashov.part6_class_design.interface_impl;

/**
 * Created by Serhii K. on 10/27/2015.
 */
interface HasTail {  public int getTailLength(); }

interface HasWhiskers {  public int getNumberOfWhiskers(); }

public interface Seal extends HasTail, HasWhiskers {
}

abstract class HarborSeal implements HasTail, HasWhiskers { }

// doesn’t provide an implementation for the interface methods
/*
class LeopardSeal implements HasTail, HasWhiskers {  // DOES NOT COMPILE
}*/
