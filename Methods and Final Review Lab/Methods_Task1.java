import java.util.Scanner;

public class Methods_Task1{
  public static void evenChecker(int num){
    if(num%2==0){
      System.out.println("Even!!");
    }else{
      System.out.println("Odd!!");
    }
  }
 
  public static boolean isEven(int num1){
    if(num1%2==0){
      return true;
    }
    return false;
  }
 
  public static boolean isPos(int num3){
    if(num3>0){
      return true;
    }
    return false;
  }
 
  public static void sequence(int n){
    if(isPos(n) == true){
      for(int i=0; i<=n; i++){
        if(isEven(i) == true){
          System.out.print(i+ " ");
        }
      }
    }else if(isPos(n) == false){
      for(int j=n; j <=-1; j++){
        if(isEven(j) == false){
          System.out.print(j+" ");
        }
      }
    }
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    evenChecker(sc.nextInt());
    System.out.println(isEven(sc.nextInt()));
    System.out.println(isPos(sc.nextInt()));
    sequence(sc.nextInt());
   
  }
}