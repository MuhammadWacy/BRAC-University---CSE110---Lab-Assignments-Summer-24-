//Task-1

import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int distance = sc.nextInt();
    float fuel = sc.nextFloat();
    
    float rate = distance/fuel;
    
    System.out.println(rate+" km/l");
  }
}