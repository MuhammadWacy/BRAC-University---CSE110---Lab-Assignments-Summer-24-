//Task-12 important

import java.util.Scanner;

public class Task12{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int total = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka)");
    int paid = sc.nextInt();
    
    if(paid>total){
      int change = paid - total;
      System.out.println("The returned amount is "+change+" taka.");
      int hundread = change/100;
      int rem = change%100;
      int fifty = rem/50;
      int rem2 = rem%50;
      int twenty = rem2/20;
      int rem3 = rem2%20;
      int ten = rem3/10;
      int rem4 = rem3%10;
      int five = rem4/5;
      int rem5 = rem4%5;
      int two = rem5/2;
      int rem6 = rem5%2;
      
      System.out.printf("100 taka note : %d\n 50 taka note : %d\n 20 taka note : %d\n 10 taka note :%d\n 5 taka coin : %d\n 2 taka coin: %d\n 1 taka coin: %d",hundread,fifty,twenty,ten,five,two,rem6);
    }
    else if (paid == total){
      System.out.println("The returned amount is 0 taka.");
    }
    else{
      System.out.println("Please pay "+(total-paid)+" taka more.");
    }
  }
}