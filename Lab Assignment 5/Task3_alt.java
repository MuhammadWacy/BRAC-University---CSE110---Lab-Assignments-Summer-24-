import java.util.Scanner;

public class Task3_alt{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Number: ");
    int n = sc.nextInt();
    
    while(n%2==0){
    int count = 0;
    
    int j=1;
    while(n<=j){
      if(n%j==0){
        count++;
      }
      j++;
    }
    System.out.println(n+" has "+count+" divisors");
    System.out.println("Enter Number: ");
    n = sc.nextInt();
    }
  }
}