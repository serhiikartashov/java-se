package org.kartashov.part11_io.streams;

import java.io.*;

public class DataStream2 {

    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("io/data/binary.data"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();

        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("io/data/binary.data"));

        int   int123     = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        long  long789    = dataInputStream.readLong();

        dataInputStream.close();

        System.out.println("int123     = " + int123);
        System.out.println("float12345 = " + float12345);
        System.out.println("long789    = " + long789);
    }
}
