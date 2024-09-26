//Task-8

import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("n = ");
    int n = sc.nextInt();
    
    int num=0;
    int i=0;
    while(i<=n){
      if(num%3!=0 && num%5==0){
        System.out.println(num);
        num++;
      }else{
        num++;
      }
      i++;
    }
  }
}