//Task-6

import java.util.Scanner;

public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String line = sc.nextLine();
    String word = "";
    String reverse = "";
    
    for(int i= (line.length()-1); i>=0; i--){
      char c = line.charAt(i);
      if((int)c != (int)' '){
        word+=c;
      }else if((int)c == (int)' '){
        for(int j = (word.length()-1); j>=0; j--){
          char r = word.charAt(j);
          reverse+=r;
        }
        System.out.print(reverse+" ");
        word="";
        reverse="";
      }
    }
    for(int j = (word.length()-1); j>=0; j--){
          char r = word.charAt(j);
          reverse+=r;
        }
    System.out.println(reverse);
  }
}