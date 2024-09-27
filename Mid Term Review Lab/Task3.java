//Task-3

import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    
    double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    double slope = (y2-y1)/(x2-x1);
    
    System.out.println("Distance: "+distance);
    System.out.println("Slope: "+slope);
    
    if(slope==0){
      System.out.println("The slope is Zero");
    }
    else if(slope>0){
      System.out.println("The slope is Positive");
    }
    else if(slope<0){
      System.out.println("The slope is Negative");
    }
  }
}