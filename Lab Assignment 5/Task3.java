//Task-3
import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter Number: ");
    int n = sc.nextInt();
   
    int x = 1;
    while(n%2==0){
    int divisor = 0;
   
    if(n%2==0){
      int i=1;
      while(i<=n){
        if(n%i==0){
          divisor++;
        }
        i++;
      }
      System.out.println(n+" has "+divisor+" divisors");
    }
    System.out.println("Enter Number : ");
    n = sc.nextInt();
  }
}
}