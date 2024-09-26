//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int i=0;
    int num;
    int sum=0;
    
    while(i<10){
      System.out.print("Enter Number: ");
      num = sc.nextInt();
      
      if(i==0){
        System.out.println("Sum= "+num);
        sum+=num;
        i++;
      }else{
       sum+=num;
       System.out.println("Sum = "+sum);
       i++;
      }
    }
  }
}