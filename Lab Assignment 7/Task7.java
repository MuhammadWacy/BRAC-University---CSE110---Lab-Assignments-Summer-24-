//Task-7

import java.util.Scanner;

public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int arr [] = {23,100,23,56,100};
    
    System.out.println("Input array: ");
    
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    
    System.out.println();
    System.out.println("New array: ");
    int num = 0;
    
    for(int j=0; j<arr.length; j++){
      int count = 0;
      int c = arr[j];
      for(int k=0; k<arr.length; k++){
        if(c == arr[k]){
          count++;
          if(count>1){
            num++;
          }
        }
      }
    }
    
    int[] arr1 = new int[arr.length-(num/2)];
    int sum = 0;
    int index = 0;
    
    for(int x=0; x<arr.length; x++){
      int d = arr[x];
      int count_1 = 0;
      for(int y=0; y<arr1.length; y++){
        if(d == arr1[y]){
          count_1++;
        }
      }
      if(count_1 == 0){
        arr1[index] = d;
        index+=1;
      }
    }
    
    for(int z=0; z<arr1.length; z++){
      System.out.print(arr1[z]+" ");
    }
  }
}