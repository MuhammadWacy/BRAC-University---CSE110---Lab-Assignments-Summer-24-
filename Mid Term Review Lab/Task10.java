//Task-10

import java.util.Scanner;

public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a binary number : ");
    int num = sc.nextInt();
    int temp = num;
    
    int count=0;
    while(temp!=0){
      temp=temp/10;
      count++;
    }
    
    int digit=0;
    int sum=0;
    int term=0;
    for(int i=0; i<count; i++){
      digit=num%10;
      term=(int)Math.pow(2,i);
      digit=digit*term;
      sum+=digit;
      num=num/10;
    }
    System.out.println("Number in decimal : "+sum);
  }
}