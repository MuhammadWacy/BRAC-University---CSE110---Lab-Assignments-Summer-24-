//Task-13

import java.util.Scanner;

public class Task13{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter three numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    if(num1 == num2 && num2 == num3 && num3 == num1){
      System.out.println("All numbers are equal");
    }
    else if(num1 != num2 && num2 != num3 && num3 != num1){
      System.out.println("All numbers are different");
    }
    else{
      System.out.println("Neither all are equal or different");
    }
  }
}