//Task-3

import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String word = sc.nextLine();
    char character = sc.next().charAt(0); // That is how we input characters in Java
    String partial = "";
    
    for(int i=0; i<word.length(); i++){
      char ch = word.charAt(i);
      if(ch == character){ // That is how we compare characters in Java
       System.out.println(partial);
       partial = "";
      }else{
        partial+=ch;
      }
    }
    System.out.println(partial);
  }
}