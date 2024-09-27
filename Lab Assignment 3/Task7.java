//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the value of x : ");
    int x = sc.nextInt();
    int temp;
    
    if(x<0){
      System.out.println("output: "+2*x);
    }
    else if(x>=0 && x<2){
      temp = x+1;
      System.out.println("output: "+temp);
    }
    else if(x>=2&& x<5){
      temp = ((x*x)-1);
      System.out.println("output: "+temp);
    }
    else if(x>=5 || x==5){
      temp = (3*(x*x))+2;
      System.out.println("output: "+temp);
    }
  }
}