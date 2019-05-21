javac src/main/java/org/kartashov/part1_building_blocks/writing_main/Zoo.java

Puts the generated .class files in the same directory

To put them in a different directory, use the -d option and supply a path.

javac -d bin src/main/java/org/kartashov/part1_building_blocks/writing_main/Zoo.java

Each file can contain only one class
 javac -d bin src/main/java/org/kartashov/part1_building_blocks/writing_main/Animal3.java

execution
java -cp ./bin org.kartashov.part1_building_blocks.writing_main.Zoo
the same: 
java -classpath ./bin org.kartashov.part1_building_blocks.writing_main.Zoo

Note: don't need to define class path if you compile and execute class in the same directory
i.e. java org.kartashov.part1_building_blocks.writing_main.Zoo
     or if class doesn't have any package:
     java Zoo

Print String arguments!
java -cp ./bin org.kartashov.part1_building_blocks.writing_main.Echo Drink Hot java
Drink
Hot
java

Quotes
java -cp ./bin org.kartashov.part1_building_blocks.writing_main.Echo "Drink Hot" java
Drink Hot
java


Windows
java -cp "Test.jar;lib/*" my.package.MainClass

Unix
java -cp "Test.jar:lib/*" my.package.MainClass

java:
-D<name>=<value> 
                  set a system property

javac -d bin src/main/java/org/kartashov/part1_building_blocks/writing_main/foo.java

    public class foo {
        class bar {
            public int x;
        }
    
        public void zark () {
            Object f = new Object () {
                public String toString() {
                    return "hello";
                }
            };
        }
    }

- foo.class, containing the main (outer) class foo
- foo$bar.class, containing the named inner class foo.bar
- foo$1.class, containing the anonymous inner class (local to method foo.zark)
