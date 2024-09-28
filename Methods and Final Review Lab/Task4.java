//Task-4

import java.util.Scanner;

public class Task4{
  public static boolean isHappyNumber(int n){
    
    int rem=0;
    while(true){
      int sum=0;
      while(n!=0){
        rem=n%10;
        rem=rem*rem;
        sum+=rem;
        n=n/10;
      }
      n = sum;
      if(sum == 1){
        return true;
      }else if(sum == 4){
        return false;
      }
    }
  }
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println(isHappyNumber(sc.nextInt()));
  }
}