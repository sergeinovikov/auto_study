package main.lesson2.task4;

import java.util.Arrays;

public class Words {
    public static void main(String[] args) {
        Words twoWords = new Words();
        twoWords.checkWords("hello", "world");
        twoWords.checkWords("ping", "pong");
        twoWords.checkWords("qwer", "asdf");
        twoWords.checkWords("post", "get");
    }


    void checkWords(String word1, String word2) {
        String sortWord1 = sortString(word1);
        String sortWord2 = sortString(word2);
        String result = "";
        for (int i = 0; i < sortWord1.length(); i++) {
            for (int j = 0; j < sortWord2.length(); j++) {
                String stringValueOf = String.valueOf(sortWord2.charAt(j));
                if (sortWord1.charAt(i) == sortWord2.charAt(j)&&!(result.contains(stringValueOf))) {
                    result = result + sortWord2.charAt(j);
                }
            }
        }
        System.out.println(result);
    }

    String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
