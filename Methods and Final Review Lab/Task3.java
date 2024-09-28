//Task-3

import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String[] email_list = {"cse110@gmail.com", "government@cv.",  "eee@bracu.ac.bd"};
    int count=0;
    int count_1=0;
    int count_2=0;
    int count_3=0;
    int count_4=0;
    int count_5=0;
    
    for(int i=0; i<email_list.length; i++){
      count_1=0;
      count_2=0;
      count_3=0;
      count_4=0;
      count_5=0;
      String temp = email_list[i];
      
      for(int j=0; j<temp.length(); j++){
        char c = temp.charAt(j);
        
        if(j == 0){
          if((int)c >= (int)'A' && (int)c <= (int)'Z' || (int)c >= (int)'a' && (int)c <= (int)'z'){
          count_2++;
          }
          }
        if((int)c == (int)'@'){
          count_1++;
        }
        else if(count_4>=1){
          if((int)c >= (int)'A' && (int)c <= (int)'Z' || (int)c >= (int)'a' && (int)c <= (int)'z'){
            count_5++;
          }
        }
        else if((int)c >= (int)'A' && (int)c <= (int)'Z' || (int)c >= (int)'a' && (int)c <= (int)'z'){
          count_3++;
        }
        else if((int)c == (int)'.'){
          count_4++;
        }
      }
      if(count_1 >= 1 && count_2>= 1 && count_3>= 1 && count_4>=1 && count_5>=1){
        count++;
      }
    }
    System.out.println(count);
  }
}