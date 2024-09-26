//Task-4
import java.util.Scanner;

public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int sum = 0;
    
    for(int i=1; i<=n; i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      sum = x;
      int odd = x;
      
      if(x%2==0){
         sum++;
         odd++;
         for(int j=1; j<y; j++){
          odd+=2;
          sum+=odd;
         }
         System.out.println(sum);
      }
      else{
        for(int j=1; j<y; j++){
          odd+=2;
          sum+=odd;
      }
        System.out.println(sum);
    }
  }
}
}