//Task-3

import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number : ");
    int num = sc.nextInt();
    
    while(num>=0){
     System.out.println(num+"^ 2 = "+(num*num));
     num = sc.nextInt();
    } 
  }
}