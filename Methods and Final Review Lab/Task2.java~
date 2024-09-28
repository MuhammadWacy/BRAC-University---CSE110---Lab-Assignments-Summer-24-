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
         }else{
            count = 0;
          }
        }else{
          for(int j=modified.length()-1; j<modified.length()-1-count; j--){
            char e = modified.charAt(j);
            final_word+=j;
          }
          modified = final_word;
          count = 0;
        }
    }
    System.out.println(modified);
  }
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    modifyStrings(sc.nextLine(), sc.nextLine(), sc.nextLine());
  }
}