//Task-4

import java.util.Scanner;

public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    System.out.println("Divisors of "+n+":");
    
    int i=1;
    while(i<=n){
      if(n%i == 0){
        System.out.println(i);
      }
      i++;
    }
  }
}