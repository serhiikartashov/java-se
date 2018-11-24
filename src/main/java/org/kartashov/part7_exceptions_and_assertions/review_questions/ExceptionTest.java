package org.kartashov.part7_exceptions_and_assertions.review_questions;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

public class ExceptionTest {

    void myMethod() throws MyException {
        throw new MyException3();
    }

/*    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.myMethod();
        } catch (MyException me) {
            System.out.println("MyException thrown");
        } catch (MyException3 me3) {
            System.out.println("MyException3 thrown");
        } finally {
            System.out.println(" Done");
        }
    }*/
}
