//Task-2

import java.util.Scanner;

public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("N = ");
    int n = sc.nextInt();
    System.out.println("Input the 5 numbers: ");
    int sum=0;
    int num;
    
    for(int i=0;i<n;i++){
      num = sc.nextInt();
      sum=sum+num;
    }
    
    double avg = (double)sum/n;
    System.out.println("The sum of 5 no is: "+sum);
    System.out.println("The Average is: "+avg);
  }
}