//Task-9

import java.util.Scanner;

public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int digit=0;
    int sum=0;
    
    int i=1;
    while(num!=0){
      digit=num%10;
      sum+=digit;
      num=num/10;
    }
    
    if(sum%2==0){
      System.out.println("The sum is even.");
    }else{
      System.out.println("The sum is odd.");
    }
  }
}