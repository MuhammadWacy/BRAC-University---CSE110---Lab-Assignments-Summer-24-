//Task-1(a)

import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    int i = 24;
   
    while(i >= 0){
      System.out.print(i+", ");
      i = i-6;
    }
    System.out.println(i);
  
    
//Task-1(b)
   
    int x = -10;
    while(x <=15){
      System.out.print(x+", ");
      x+=5;
    }
    System.out.print(x);
  }
}