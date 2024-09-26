//Task-10

import java.util.Scanner;

public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an integer : ");
    int num = sc.nextInt();
    int temp = num;
    int digits=0;
    
    while(temp!=0){
      temp = temp/10;
      digits++;
    }
    
    int term = (int)Math.pow(10,digits-1);
    
    while(num!=0){
      int num1=num/term;
      num=num%term;
      term=term/10;
      
      System.out.print(num1+", ");
    }
  }
}