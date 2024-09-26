//Task-9 alternative

import java.util.Scanner;

public class Task9Alt{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int temp = num;
    
    
    int count = 0;
    while(temp!=0){
      temp=temp/10;
      count++;
    }
    
    int digits = (int)Math.pow(10, count-1);
    
    int sum=0;
    int n=0;
    int i=1;
    while(num!=0){
      n=num/digits;
      sum+=n;
      num=num%digits;
      digits/=10;
    }
    if(sum%2==0){
      System.out.println("The number is even.");
    }else{
      System.out.println("The number is odd.");
    }
    System.out.println("Sum : "+sum);
  }
}