//Task-9 important

import java.util.Scanner;

public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your payment : ");
    int pay = sc.nextInt();
    System.out.println("Enter your age : ");
    int age = sc.nextInt();
    
    if(age>=18){
      if(pay<10000){
        System.out.println("Your tax amounts in 0 Tk");
      }
      else if(pay>=10000 && pay<=20000){
        double tax = 0.05*pay;
        System.out.println("Your tax amounts in "+(int)tax+" Tk");
      }
      else if(pay>20000){
        double tax = 0.1*pay;
        System.out.println("Your tax amounts in "+(int)tax+" Tk");
      }
    }
    else{
      System.out.println("Your tax amounts in 0 Tk");
    }
  }
}