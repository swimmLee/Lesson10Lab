/*
 *
 */
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lheberer
 */
public class ArrayWriter implements Writer{
    
    List<String> wordList = new ArrayList<>();
    
    public ArrayWriter(){
        
        wordList.add("first");

    }
    
    @Override
    public void writeln(String line){
        System.out.println("The ArrayList is: \n");
        wordList.add(line);
        for(String ele : wordList){
            System.out.println(ele);
        }
    }
}
