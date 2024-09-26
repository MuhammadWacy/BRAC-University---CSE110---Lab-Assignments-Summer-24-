//Task-8

import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    System.out.print(num);
    
    int rem = num;
    while(rem!=1){
      if(rem%2==0){
        rem=rem/2;
        System.out.print(", "+rem);
      }else{
        rem=(rem*3)+1;
        System.out.print(", "+rem);
      }
    }
  }
}