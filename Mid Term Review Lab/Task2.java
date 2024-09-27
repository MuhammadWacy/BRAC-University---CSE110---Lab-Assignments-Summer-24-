//Task-2

import java.util.Scanner;

public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int code = sc.nextInt();
    int quantity = sc.nextInt();
    
    if(code==1){
      System.out.println("Item: Hot Dog");
      System.out.println("Quantity: "+quantity);
      System.out.printf("Total: $%.2f",4.00*quantity);
    }
    else if(code==2){
      System.out.println("Item: X-Salad");
      System.out.println("Quantity: "+quantity);
      System.out.printf("Total: $%.2f",4.50*quantity);
    }
    else if(code==3){
      System.out.println("Item: X-Bacon");
      System.out.println("Quantity: "+quantity);
      System.out.printf("Total: $%.2f",5.00*quantity);
    }
    else if(code==4){
      System.out.println("Item: Toast");
      System.out.println("Quantity: "+quantity);
      System.out.printf("Total: $%.2f",2.00*quantity);
    }
    else if(code==5){
      System.out.println("Item: Soda");
      System.out.println("Quantity: "+quantity);
      System.out.printf("Total: $%.2f",1.50*quantity);
    }
  }
}