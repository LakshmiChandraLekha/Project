package Pratice;

import java.util.*;



public class PrimeNumber {
    public static void main(String[] args) {
        String inputString = "aaabccccdd";
        Map<Character, Integer> charCount= new HashMap<>();
        for(int i=0; i<inputString.length(); i++){
            char ch = inputString.charAt(i);
            if(charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)+1);
            }
            else{
                charCount.put(ch,1);
            }
        }
        Set<Character> charsInMap = charCount.keySet();
        for(char ch1: charsInMap){
            if(charCount.get(ch1) >=1){
                System.out.print(ch1 + "" + charCount.get(ch1));
            }
        }
        }
    }




