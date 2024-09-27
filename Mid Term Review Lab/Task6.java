//Task-6

import java.util.Scanner;

public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double y=0;
    
    int i=1;
    while(i<=n){
      if(i%4==0){
        y-=(1.0/i);
      }else{
        y+=(1.0/i);
      }
      i++;
    }
    System.out.println("Y = "+y);
  }
}