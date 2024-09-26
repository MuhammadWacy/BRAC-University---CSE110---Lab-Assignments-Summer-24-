//Task-1
import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String word = sc.nextLine();
    String capital_word = "";
    
    int length = word.length();
    
    for(int i=0; i<length; i++){
      char c = word.charAt(i);
      if((int)c >= (int)'a'&& (int)c <= (int)'z'){
        capital_word += (char)((int)c-((int)'a' - (int)'A'));
      }
      else{
        capital_word += c;
      }
    }
   System.out.println(capital_word);
  }
}