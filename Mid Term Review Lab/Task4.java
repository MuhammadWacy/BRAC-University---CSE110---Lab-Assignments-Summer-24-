//Task-4

import java.util.Scanner;

public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    double determinant = (int)((b*b)-(4*a*c));
    
    if(determinant<0 || a==0){
      System.out.println("Impossible to calculate");
    }else{
      double d1 = Math.sqrt(determinant);
      double x1 = (-b+d1)/2*a;
      double x2 = (-b-d1)/2*a;
      System.out.println("Root#1 = "+x1);
      System.out.println("Root#2 = "+x2);
    }
  }
}