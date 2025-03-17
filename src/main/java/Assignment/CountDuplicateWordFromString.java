package Assignment;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateWordFromString {
    public static void main(String[] args) {
        countDuplicatesWords("java is a programming language but java is not a easy language");

    }

    public static void countDuplicatesWords(String inputString){
               String[] words = inputString.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();
               for(String word: words){
                   if(wordCount.containsKey(word)){
                       wordCount.put(word,wordCount.get(word) + 1);
                   }
                   else{
                       wordCount.put(word, 1);
                   }
               }
               // keyset() method extract all keys from map
               Set<String> wordsInMap = wordCount.keySet();
               for(String word1: wordsInMap){
                   if(wordCount.get(word1) > 1){
                       System.out.println(word1 + " : " + wordCount.get(word1));
                   }
               }
    }
}
