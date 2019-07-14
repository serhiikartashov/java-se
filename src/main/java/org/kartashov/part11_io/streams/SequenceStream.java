package org.kartashov.part11_io.streams;

import java.io.*;
import java.util.Vector;

public class SequenceStream {

    public static void main(String[] args) throws IOException {
        InputStream input1 = new FileInputStream("io\\data\\file1.txt");
        InputStream input2 = new FileInputStream("io\\data\\file2.txt");
        InputStream input3 = new FileInputStream("io\\data\\file3.txt");
        InputStream input4 = new FileInputStream("io\\data\\file4.txt");

//        Vector<InputStream> streams = new Vector<>();
//        streams.add(input1);
//        streams.add(input2);
//        streams.add(input3);
//
//        SequenceInputStream sequenceInputStream =
//                new SequenceInputStream(streams.elements());
//
//        int data = sequenceInputStream.read();
//        while(data != -1){
//            System.out.println((char)data);
//            data = sequenceInputStream.read();
//        }
//        sequenceInputStream.close();


        SequenceInputStream sequenceInputStream1 =
                new SequenceInputStream(input1, input2);

        SequenceInputStream sequenceInputStream2 =
                new SequenceInputStream(input3, input4);

        SequenceInputStream sequenceInputStreamAll =
                new SequenceInputStream(
                        sequenceInputStream1, sequenceInputStream2);

            int dataAll = sequenceInputStreamAll.read();
            while(dataAll != -1){
                System.out.println((char)dataAll);
                dataAll = sequenceInputStreamAll.read();
            }
            sequenceInputStreamAll.close();
    }
}
