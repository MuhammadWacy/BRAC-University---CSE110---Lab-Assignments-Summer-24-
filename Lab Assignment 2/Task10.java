//Task-10 important
import java.util.Scanner;

public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 3 floats : ");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    float num3 = sc.nextFloat();
    
    if(num1>num2 && num1>num3){
      System.out.println("Maximum number is : "+num1);
      if(num2>num3){
        System.out.println("Minimum number is : "+num3);
      }
      else{
        System.out.println("Minimum number is : "+num2);
      }
    }
    else if(num2>num1 && num2>num3){
      System.out.println("Maximum number is : "+num2);
      if(num1>num3){
        System.out.println("Minimum number is : "+num3);
      }
      else{
        System.out.println("Minimum number is : "+num1);
      }
    }
    else{
      System.out.println("Maximum number is : "+num3);
      if(num1>num2){
        System.out.println("Minimum number is : "+num2);
      }
      else{
        System.out.println("Minimum number is : "+num1);
      }
    }
  }
}