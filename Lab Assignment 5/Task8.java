//Task-8
import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum = 0;
    int cube = 0;
    System.out.println("Armstrong Number: ");
    
    for(int i=n1;i<=n2; i++){
      sum = 0;
      int num = i;
      int temp = num;
      int digits = 0;
      int num1 = 0;
      
      while(temp!=0){
      temp = temp/10;
      digits++;
     }
    
     int term = (int)Math.pow(10,digits-1);
    
     while(num!=0){
       num1=num/term;
       num=num%term;
       term=term/10;
       cube = num1*num1*num1;
       sum+=cube;
     }
     if(sum==i){
         System.out.println(sum);
     }
    }
  }
}