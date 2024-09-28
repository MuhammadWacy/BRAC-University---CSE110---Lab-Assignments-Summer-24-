//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
    
    System.out.println("Prime Numbers: ");
    
    for(int i=0; i<arr.length; i++){
      int element = arr[i];
      int count = 0;
      
      for(int j=1; j<=element; j++){
        if(element%j == 0){
          count++;
        }
      }
      if(count == 2){
        System.out.println(i+": "+element);
      }
    }
    
    System.out.println("Perfect Numbers: ");
    
    for(int x=0; x<arr.length; x++){
      int element_1 = arr[x];
      int temp = 0;
      int sum = 0;
      
      for(int y=1; y<element_1; y++){
        if(element_1%y == 0){
          temp = y;
          sum+=temp;
        }
      }
      if(sum == element_1){
        System.out.println(x+": "+element_1);
      }
    }
  }
}