//Task-5

import java.util.Scanner;

public class Task5{
  public static int toDecimal(String num){
    
    int sum = 0;
    int power = 0;
    for(int i=num.length()-1; i>=0; i--){
      int temp = 0;
      char c = num.charAt(i);
      if((int)c == (int)'1'){
        temp = (int)Math.pow(2, power);
        sum+=temp;
        power++;
      }else{
        power++;
      }
    }
    return sum;
  }
  
  public static String toHex(int num2){
    
    String reverse = "";
    String reverse_hex = "";
    int temp = 0;
    
    while(num2!=0){
      temp=num2%16;
      num2=num2/16;
      if(temp>=0 && temp<=9){
        reverse_hex+=temp;
      }else if(temp>=10 && temp<=15){
        for(int j=temp; j<16; j++){
          int x = (int)'A';
          if(temp == j){
            reverse_hex+= (char)(x+(10-j));
            break;
          }
        }
      }
    }
    
    for(int k=reverse_hex.length()-1; k>=0; k--){
      char y = reverse_hex.charAt(k);
      reverse+=y;
    }
    return reverse;
  }
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println(toHex(toDecimal("1010")));
  }
}