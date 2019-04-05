/*
 *
 */
package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lheberer
 */
public class ArrayReader implements Reader {
    
    @Override
    public String readln(){
        System.out.println("Please enter a word to add to the arrayList, then press return:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
