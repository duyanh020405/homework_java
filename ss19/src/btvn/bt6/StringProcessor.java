package btvn.bt6;

import java.util.List;

public interface StringProcessor {
    String processString(String text);
   default public void printList(List<String> list){
       for(String s : list){
           System.out.println(s);
       }
    }
}
