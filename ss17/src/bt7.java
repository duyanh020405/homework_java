package ss17.src;

import java.util.*;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đoạn văn bản: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.toLowerCase().split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);

        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}