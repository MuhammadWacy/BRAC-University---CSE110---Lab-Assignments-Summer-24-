//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String word_1 = sc.nextLine();
    String word_2 = sc.nextLine();
    int count = 0;
    String result = "";
    
    for(int i=0; i<word_1.length(); i++){
      char c = word_1.charAt(i);
      for(int j=0; j<word_2.length(); j++){
        char v = word_2.charAt(j);
        if(c == v){
          count++;
        }
      }
      if(count == 0){
        c = (char)((int)c - 32);
        result+=c;
      }
      count = 0;
    }
    for(int k=0; k<word_2.length(); k++){
      char d = word_2.charAt(k);
      for(int m=0; m<word_1.length(); m++){
        char s = word_1.charAt(m);
        if(d == s){
          count++;
        }
      }
      if(count == 0){
        d = (char)((int)d - 32);
        result+=d;
      }
      count = 0;
    }
    System.out.println(result);
  }
}