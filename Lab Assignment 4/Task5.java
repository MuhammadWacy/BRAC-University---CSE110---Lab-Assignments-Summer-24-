//Task-5

import java.util.Scanner;

public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    int term = 1;
    int num;
    int positive=0;
    int negative=0;
    
    int i = 1;
    while(i<=n){
      System.out.print("Enter number "+term+":");
      num = sc.nextInt();
      if(num>=0){
        positive++;
      }else{
          negative++;
        }
      term++;
      i++;
    }
    System.out.println(positive+" Non-negative Numbers");
    System.out.println(negative+" Negative Numbers");
  }
}