package testing.forest.questions;

import io.Simulator;

import java.util.Random;

public class Question2 {
    Random random = new Random();
    public Question2() {
        Simulator.header("Question 2");

        String[] words = {"hello", "world", "java", "programming", "language", "computer", "science", "software", "engineering"};
        for (int i = 0; i < 5; i++) {
            processWords(words[random.nextInt(words.length)], words[random.nextInt(words.length)]);
        }
    }

    public static void processWords(String word1, String word2) {
        String str1 = word1.substring(0, 2);
        String str2 = word2.substring(word2.length() - 1);
        String result = str2 + str1;
        int index = result.indexOf(str2);
        System.out.println(result.indexOf(str2));
    }
}
