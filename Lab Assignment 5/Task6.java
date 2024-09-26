//Task-6
import java.util.Scanner;

public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    int height = sc.nextInt();
   
    for(int i=1; i<=height; i++){
      for(int space=1; space<=(height-i); space++){
          System.out.print(" ");
        }
     
      for(int x=1; x<= i; x++){
        System.out.print(x);
      }
      System.out.println();
    }
  }
}