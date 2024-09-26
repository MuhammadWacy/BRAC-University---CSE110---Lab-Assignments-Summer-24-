//Task-8

import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String line = sc.nextLine();
    String alter = "";
    int count = 0;
    
    for(int i=0; i<line.length(); i++){
      char c = line.charAt(i);
      if((int)c >= (int)'A' && (int)c <= (int)'Z' || (int)c >= (int)'a' && (int)c <= (int)'z'){
        if(count%2 == 0){
          if((int)c >= (int)'A' && (int)c <= (int)'Z'){
             c = (char)((int)c + 32);
             count++;
            }else{
             count++;
          }
        }else{
          if((int)c >= (int)'a' && (int)c <= (int)'z'){
            c = (char)((int)c - 32);
            count++;
          }else{
              count++;
            }
        }
      }
      alter+=c;
    }
    System.out.println(alter);
  }
}