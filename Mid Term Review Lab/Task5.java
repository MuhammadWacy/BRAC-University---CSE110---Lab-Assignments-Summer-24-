//Task-5

import java.util.Scanner;

public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int first_value = sc.nextInt();
    int change = sc.nextInt();
    int last_value = sc.nextInt();
    
    while(first_value<(last_value)){
      System.out.print(first_value);
      first_value+=change;
      if(first_value<last_value){
        System.out.print(", ");
      }
    }
  }
}