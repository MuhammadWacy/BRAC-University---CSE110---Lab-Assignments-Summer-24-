//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int a1=3;
    int d1=4;
    int a2=-5;
    int d2=-4;
    double sum1=0;
    double sum2=0;
    
    int i=1;
    while(i<=n){
      sum1=(n/2.0)*(2*a1+(n-1)*d1);
      i++;
    }
    
    int x=1;
    while(x<=n){
      if(n%2==0){
        sum2=(n/2.0)*(2*a2+(n-1)*d2);
      }
      else{
        sum2=((n-1)/2.0)*(2*a2+(n-2)*d2);
      }
      x++;
    }
    double sum = sum1+sum2;
    System.out.println(sum);
  }
}