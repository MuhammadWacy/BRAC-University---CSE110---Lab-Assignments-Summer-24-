//Task-5
import java.util.Scanner;

public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    int length = sc.nextInt();
    int width = sc.nextInt();
   
    for(int x=1; x<=width; x++){
    for(int i=1; i<=length; i++){
     
      System.out.print(i+ " ");
    }
    System.out.println();
    }
  }
}