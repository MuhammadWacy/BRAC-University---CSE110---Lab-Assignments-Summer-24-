//Task-4

import java.util.Scanner;

public class Task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String word = sc.nextLine();
    String reverse = "";
    
    for(int i= (word.length()-1); i>=0; i--){
      char c = word.charAt(i);
      reverse+=c;
    }
    
    System.out.println(reverse);
  }
}