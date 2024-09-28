//Task-2

import java.util.Scanner;

public class Task2{
  public static void modifyStrings(String s, String s1, String s2){
    
    int count = 0;
    String modified = "";
    String final_word = "";
    for(int i=0; i<s.length(); i++){
      char c = s.charAt(i);
      if(count==0){
          char d = s1.charAt(count);
          modified+=c;
          if(c == d){
          count++;
          }
        }
      else if(count >0 && count< s1.length()){
         char d = s1.charAt(count);
         modified+=c;
         if(c == d){
          count++;
          if(count == s1.length()){
          for(int j=0; j<=modified.length()-1-count; j++){
            char e = modified.charAt(j);
            final_word+=e;
          }
          modified = final_word;
          modified+=s2;
          count = 0;
          final_word = "";
        }
         }else{
            count = 0;
          }
        }
    }
    System.out.println(modified);
  }
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    modifyStrings(sc.nextLine(), sc.nextLine(), sc.nextLine());
  }
}