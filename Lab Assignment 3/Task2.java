//Task-2
import java.util.Scanner;

public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your score : ");
   
    int score = sc.nextInt();
    if (score<=100 && score>=90){
      System.out.print("A");
    }
    else if (score<=89 && score>=85){
      System.out.print("A-");
    }
    else if (score>=70 && score<=84){
      System.out.print("B");
    }
    else if (score>=57 && score<=69){
      System.out.print("C");
    }
    else if (score>=50 && score<=56){
      System.out.print("D");
    }
    else if (score>=0 && score<=49){
      System.out.print("F");
    }
    else{
      System.out.println("The score is invalid.");
    }
  }
}