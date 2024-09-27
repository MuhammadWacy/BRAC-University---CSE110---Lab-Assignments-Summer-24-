//Trace-cross check


import java.util.Scanner;

public class Tracecrosscheck{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    
                 int a = 10;
        int b = 150500;
        double sum = a/1.0;
        while (b/a != 0){
            sum += 1.2;
            sum = b % 3 + (-- a) * 2 + sum;
            if(a>=6){
                System.out.println((int) sum);
            }
            else{
                System.out.println(sum);
            }
            b = b/a;
        }
    }
}


