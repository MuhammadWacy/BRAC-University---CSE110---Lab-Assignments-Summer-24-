//Task-5 Difficult Problem

import java.util.Scanner;

public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String word = sc.nextLine();
    String vowel = "aeiouAEIOU";
    int vowel_count = 0;
    int consonent_count = 0;
    
    for(int i=0; i< word.length(); i++){
      char c = word.charAt(i);
      if(((int)c >= (int)'a' && (int)c <= (int)'z') || ((int)c >= (int)'A' && (int)c <= (int)'Z')){
        for(int j=0; j<vowel.length(); j++){
        char v = vowel.charAt(j);
        if(j == (vowel.length()-1) && c!=v){
          consonent_count++;
        }
        else if(c == v){
          vowel_count++;
          break;
        }
        }
      }
    }
    if(vowel_count%3 == 0 && consonent_count%5 == 0){
      System.out.println("Aaarr! Me Plunder!!");
    }else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
}