package org.kartashov.part7_exceptions_and_assertions.types;
import static java.lang.System.*;

/**
 * Created by Serhii K. on 11/4/2015.
 */
public class TryBlock {

    public void doer() {
        /*try{ // DOES NOT COMPILE
            // do something
        }*/
    }

    public static void main(String[] args) {
        String s = "";
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s);
        exit();
    }

    public static void exit(){
        System.exit(0);
        System.out.println("Exit message");
        // the same
        int status = 0;
        Runtime.getRuntime().exit(status);
        /*
        Exit code is

        0 when execution went fine;
        1, -1, whatever != 0 when some error occurred, you can use different values for different kind of errors.

        Zero => Everything Okay
        Positive => Something I expected could potentially go wrong went wrong (bad command-line, can't find file, could not connect to server) analogues to Exception
        Negative => Something I didn't expect at all went wrong (system error - unanticipated exception - externally forced termination e.g. kill -9) analogues to Error
        */
    }
}
