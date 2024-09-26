//Task-12

import java.util.Scanner;

public class Task12{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    int maximum = n;
    int minimum = n;
    int sum=0;
    int count=0;
    while(n!=0){
      if(n>0 && n%2==0){
        if(n>maximum){
          maximum=n;
        }
        else if(n<minimum){
          minimum=n;
        }
        count++;
        sum+=n;
      }
      n = sc.nextInt();
    }
    double avg = (double)sum/count;
    System.out.println("Max: "+maximum);
    System.out.println("Min: "+minimum);
    System.out.println("Average: "+avg);
  }
}