//Task-11

import java.util.Scanner;

public class Task11{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of inputs : ");
    int n = sc.nextInt();
    
    int i=0;
    int maximum=-9999;
    int minimum=9999;
    int count=0;
    int sum=0;
    while(i<n){
      int num = sc.nextInt();
      if(num>0 && num%2==0){
        if(num>maximum){
          maximum=num;
        }else if(num<minimum){
          minimum=num;
        }
        sum+=num;
        count++;
      }
      i++;
    }
    double avg;
    if(count==0){
      avg=0;
    }else{
      avg = (double)sum/count;
    }
    System.out.println("Max: "+maximum);
    System.out.println("Min: "+minimum);
    System.out.println("Average: "+avg);
  }
}