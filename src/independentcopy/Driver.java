package independentcopy;

import independentcopy.reader.*;
import independentcopy.writer.*;

/**
 * @author Jim Lombardo, WCTC Lead Java Instructor
 * @version 1.02
 * @see Driver for run instructions and info about design rules
 * @see DependentCopy project for a poor design
 */
public class Driver {

    public static void main(String[] args) {
        /*
         Comment/uncomment various combinations of Reader
         and Writer classes to see how switching objects
         causes no problems with Copier class because it's
         polymorphic!!!
         */

        //Reader reader = new KeyboardReader();
        //Reader reader = new FileReader();
        Reader reader = new ArrayReader();

        //Writer writer = new ConsoleWriter();
        //Writer writer = new GuiWriter();
        //Writer writer = new FileWriter();
        Writer writer = new ArrayWriter();

        /*
        Copy from reader to writer
        Notice that Copier is NOT dependent on implementation of reader/writer
        (it is not rigid, fragile or immobile)
         */
        Copier copier = new Copier(reader, writer);
        copier.copy();
        copier.copy();

        // Send end of program message
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
}
