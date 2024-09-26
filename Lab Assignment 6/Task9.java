//Task-9

import java.util.Scanner;

public class Task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String password = sc.nextLine();
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    
    if(password.length()>=8){
        count1++;
      }
    
    for(int i=0; i<password.length(); i++){
      char c = password.charAt(i);
      
      if((int)c >= (int)'A' && (int)c <= (int)'Z'){
        count2++;
      }
      if((int)c >= (int)'a' && (int)c <= (int)'z'){
        count3++;
      }
      if((int)c >= (int)'0' && (int)c <= (int)'9'){
        count4++;
      }else{
        count5++;
      }
    }
    if(count1>=1 && count2>=1  && count3>=1 && count4>=1 && count5>=1){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
}