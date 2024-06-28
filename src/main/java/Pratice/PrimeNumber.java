package Pratice;

import java.util.*;



public class PrimeNumber {
    public static void main(String[] args) {
        reverseString("aaaaabbcdddd");
    }
 public static void reverseString(String inputString){
        HashMap<Character, Integer> countChars = new HashMap<>();
      for(int i=0; i<inputString.length(); i++){
          char ch = inputString.charAt(i);
          if(countChars.containsKey(ch)){
              countChars.put(ch, countChars.get(ch)+1);
          }
          else{
              countChars.put(ch,1);
          }
      }
      Set<Character> charsInMap = countChars.keySet();
      for(char ch1: charsInMap){
          if(countChars.get(ch1) >=1){
              System.out.print(ch1+ "" +countChars.get(ch1));
          }
      }
    }
}



