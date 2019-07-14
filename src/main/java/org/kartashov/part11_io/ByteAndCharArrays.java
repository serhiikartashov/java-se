package org.kartashov.part11_io;

import java.io.*;
import java.util.Arrays;

public class ByteAndCharArrays {

    public static void main(String[] args) throws IOException {

        // Byte
        byte[] bytes = new byte[2];
        bytes[0] = 12;

        //write data into byte array...
        InputStream input = new ByteArrayInputStream(bytes);

        //read first byte
        int data = input.read();
        while (data != -1) {
            //do something with data
            System.out.println(data);

            //read next byte
            data = input.read();
        }

        // Char
        char[] chars = new char[2];
        chars[0] = 'a';

        //write data into byte array...
        Reader ci = new CharArrayReader(chars);

        //read first byte
        int c = ci.read();
        while (c != -1) {
            //do something with data
            System.out.println((char)c);

            //read next byte
            c = input.read();
        }

        // Writes

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        output.write("This text is converted to bytes".getBytes("UTF-8"));
        byte[] bytes2 = output.toByteArray();
        System.out.println(Arrays.toString(bytes2)); // print array
        System.out.println(new String(bytes2)); // print string

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("This text is converted to bytes");
        char[] chars2 = charArrayWriter.toCharArray();
        System.out.println(chars2);
    }
}
