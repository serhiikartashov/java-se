package org.kartashov.part6_class_design.inheritance.override;

/**
 * Created by Serhii K. on 10/26/2015.
 */
public class ReturnType extends Parent {

    // cannot have default accessor!
    // overrided!
    public B doer(){
        return new B();
    }
    protected void foo(){}
}

class Parent{
    protected A doer(){
        return new A();
    }

    void foo(){}
}

class A{}

class B extends A{}