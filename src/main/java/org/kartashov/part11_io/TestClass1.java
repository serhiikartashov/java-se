package org.kartashov.part11_io;

import java.io.File;
import java.time.Instant;

/**
 * Created by Serhii K. on 3/14/2016.
 */
public class TestClass1 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(java.io.File.separator);

        File file = new File("/home/smith/data/zoo.txt");
        System.out.println(file.exists());

        File parent = new File("/home/smith");
        File child = new File(parent, "data/zoo.txt");

        showFileData("C:\\data\\zoo.txt");
        System.out.println();
        showFileData("F:\\Dropbox\\projects\\JAVA_CERTIFICATIONS\\1Z0-809\\pom.xml");
        System.out.println();
        showFileData("F:\\Dropbox\\projects\\JAVA_CERTIFICATIONS\\1Z0-809");
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
