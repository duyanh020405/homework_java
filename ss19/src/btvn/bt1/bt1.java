package btvn.bt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bt1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "", "Lambda", "Stream", "", "Functional");
        Predicate isNotEmpty = str -> !str.isEmpty();

        List<String> filteredStrings = new ArrayList<>();
        for (String str : strings) {
            if (isNotEmpty.test(str)) {
                filteredStrings.add(str);
            }
        }

        System.out.println(filteredStrings);
    }
}

