//Task-9

import java.util.Scanner;

public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an integer : ");
    int num = sc.nextInt();
    int temp=num;
    int digits=0;
    
    
    while(num!=0){
      num = num/10;
      digits++;
    }
    
    if(temp==0){
      System.out.println("The number of digits in the number : 1");
    }else{
      System.out.println("The number of digits in the number : "+digits);
    }
  }
}