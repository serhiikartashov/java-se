package org.kartashov.part11_io.streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerExample {

    public static void main(String args[]) throws IOException {
        FileReader fileReader = new FileReader("io/data/file.txt");
        StreamTokenizer st = new StreamTokenizer(fileReader);
        while(st.nextToken() != StreamTokenizer.TT_EOF) {
            if(st.ttype == StreamTokenizer.TT_NUMBER) {
                System.out.println("Number: "+st.nval);
            } else if(st.ttype == StreamTokenizer.TT_WORD) {
                System.out.println("Word: "+st.sval);
            }else if(st.ttype == StreamTokenizer.TT_EOL) {
                System.out.println("--End of Line--");
            }
        }
    }
}
