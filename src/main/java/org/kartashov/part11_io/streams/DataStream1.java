package org.kartashov.part11_io.streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStream1 {

    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(
                new FileInputStream("io/data/binary.data"));

        int    aByte   = input.read();
        int    anInt   = input.readInt();
        float  aFloat  = input.readFloat();
        double aDouble = input.readDouble();
        //etc.

        input.close();
    }
}
