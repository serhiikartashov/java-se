package org.kartashov.part1_building_blocks.package_and_import_declaration;

//import java.nio.file.Files;
//import java.nio.file.Paths;
// or
import java.nio.file.*;
//import static java.util.Arrays; // DOES NOT COMPILE

import static java.util.Arrays.asList;

/**
 * Created by Serhii K. on 29.09.2015.
 */
public class InputImports {

    public void read(Files files){
        Paths.get("name");
        asList("one");
    }
}
