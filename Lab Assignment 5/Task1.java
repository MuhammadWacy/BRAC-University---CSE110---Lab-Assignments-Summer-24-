//Task-1
import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int count;
    int prime_number=0;
    
    for(int i=1; prime_number<n; i++){
      count=0;
      for(int j=1; j<=i; j++){
        if(i%j==0){
          count++;
        }
      }
      if(count<3 && count!=1){
          prime_number++;
          System.out.println(i);
        }
    }
  }
}