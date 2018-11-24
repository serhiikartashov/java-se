package org.kartashov.part7_exceptions_and_assertions.review_questions;

import java.io.IOException;

/**
 * Created by Serhii K. on 11/4/2015.
 */
class PortConnector {

    public PortConnector(int port) throws IOException{
        if (Math.random() > 0.5) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}

public class TestClass1 {

    public static void main(String[] args) throws IOException {
        try {
            PortConnector pc = new PortConnector(10);
        } catch (Exception re) {
            re.printStackTrace();
        }
    }
}
