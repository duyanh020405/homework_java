package btvn.bt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("lambda");
        strings.add("stream");
        strings.add("functional");

        StringProcessor processor = input -> input.toUpperCase() + " - TECHNICAL";


        List<String> after = new ArrayList<>();
        for (String s : strings) {
            after.add(processor.processString(s));
        }
        processor.printList(after);



    }
}
