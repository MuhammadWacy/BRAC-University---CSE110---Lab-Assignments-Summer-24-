//Task-2

import java.util.Scanner;

public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int arr[]={9, -5, 7, 9, -5, 5, 7};
    int count = 0;
    System.out.println("Before removing duplicates : ");
    for(int m=0; m<arr.length; m++){
      System.out.print(arr[m]+" ");
    }
    System.out.println();
    
    for(int i=0; i<arr.length; i++){
      int a = arr[i];
      count = 0;
      for(int j=0; j<arr.length; j++){
        if(arr[j] == a){
          count++;
          if(count>1){
            arr[j] = 0;
          }
        }
      }
    }
    System.out.println("After replacing the duplicates with 0: ");
    
    for(int k=0; k<arr.length; k++){
      System.out.print(arr[k]+" ");
    }
  }
}