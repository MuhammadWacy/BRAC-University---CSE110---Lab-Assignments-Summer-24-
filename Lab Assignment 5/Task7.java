//Task-7
import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int height = sc.nextInt();
    int space = 1;
    int pattern = 1;
    
    for(int i=1; i<=height; i++){
      for(int s=1; s<=(height-space); s++){
        System.out.print(" ");
      }
      for(int j=1; j<=pattern; j++){
        System.out.print(j);
      }
      pattern+=2;
      System.out.println();
      space++;
    }
  }
}