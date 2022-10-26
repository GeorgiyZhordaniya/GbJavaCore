package hw.lesson4.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("one","two","three","four","five","six","seven","eight","nine",
                "one","three","six");

        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.println("Уникальные слова:");
        uniqueWords.forEach(System.out::println);

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

//        wordsCount.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });

        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Колличество уникальных слов:");
        wordsCount.entrySet().forEach(System.out::println);



    }
}