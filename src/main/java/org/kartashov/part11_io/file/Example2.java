package org.kartashov.part11_io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;

/**
 * Created by Serhii K. on 3/14/2016.
 */
public class Example2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(java.io.File.separator);

        File file1 = new File("./io/data/zoo.txt");
        showFileData("./io/data/zoo.txt");

        File file = new File("/io/data/zoo.txt");
        System.out.println(file.exists());

        File parent = new File("/io");
        File child = new File(parent, "data/zoo.txt");

        showFileData("io\\data\\zoo.txt");
        System.out.println();
        showFileData("build.gradle");
        System.out.println();
        showFileData(".");
    }

//    public static void main2(String[] args) throws Exception {
//        File f = new File("x");   //1
//        BufferedReader bfr1 = new BufferedReader(new FileReader(f)); //2
//        BufferedReader bfr2 = new BufferedReader( bfr1 ); //3
//        PrintWriter pw = new PrintWriter(new FileReader(f)); //4
//    }

        private static void showFileData (String path){
            File file = new File(path);
            System.out.println("File Exists: " + file.exists());
            if (file.exists()) {
                System.out.println("Absolute Path: " + file.getAbsolutePath());
                System.out.println("Is Directory: " + file.isDirectory());
                System.out.println("Parent Path: " + file.getParent());
                if (file.isFile()) {
                    System.out.println("File size: " + file.length());
                    System.out.println("File LastModified: " + Instant.ofEpochMilli(file.lastModified()));
                } else {
                    for (File subfile : file.listFiles()) {
                        System.out.println("\t" + subfile.getName());
                    }
                }
            }
        }
    }
