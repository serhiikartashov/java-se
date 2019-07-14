package org.kartashov.part11_io.file;

import java.io.File;

public class Example1 {

//    public static void main(String[] args) {
//        File f = null;
//        String[] strs = {"io/data/test1.txt", "io/data/test2.txt"};
//        try {
//            // for each string in string array
//            for(String s:strs ) {
//                // create new file
//                f = new File(s);
//
//                // true if the file is executable
//                boolean bool = f.canExecute();
//
//                // find the absolute path
//                String a = f.getAbsolutePath();
//
//                // prints absolute path
//                System.out.print(a);
//
//                // prints
//                System.out.println(" is executable: "+ bool);
//            }
//        } catch (Exception e) {
//            // if any I/O error occurs
//            e.printStackTrace();
//        }
//    }

    // Check permissions
    public static void main(String[] args) {
        // creating a file instance
        File file = new File("io/data/test1.txt");

        // check if the file exists
        boolean exists = file.exists();
        if (exists == true) {
            // printing the permissions associated with the file
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File not found.");
        }
    }
}
