//Task-2
import java.util.Scanner;

public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int sum1=0;
    int sum2=0;
    
    for(int i=1; i<=n; i++){
      sum1=0;
      for(int j=1; j<=i; j++){
        sum1+=j;
      }
      sum2+=sum1;
    }
    System.out.println((-1)*sum2);
  }
}