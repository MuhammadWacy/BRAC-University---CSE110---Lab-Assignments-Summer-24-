//Task-11

import java.util.Scanner;

public class Task11{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of three sides of the triangle : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a==b && b==c && c==a){
      System.out.println("This is a Equilateral triangle");
    }
    else if(a!=b && b!=c && c!=a){
      System.out.println("This is a Scalene triangle");
    }else if(a==b || b==a || c==a){
      System.out.println("This is a Isosceles triangle");
    }
  }
}