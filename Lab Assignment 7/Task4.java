//Task-4

import java.util.Scanner;

public class Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("N = ");
    
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    
    for(int i=0; i<arr1.length; i++){
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("Original array:");
    
    for(int j=0; j<arr1.length; j++){
      System.out.print(arr1[j]+" ");
    }
    
    System.out.println();
    System.out.println("After modifying: ");
    
    for(int k=0; k<arr1.length; k++){
      if(arr1[k]>0){
        arr1[k] = 1;
      }else if(arr1[k]<=0){
        arr1[k] = 0;
      }
    }
    
    for(int m=0; m<arr1.length; m++){
      System.out.print(arr1[m]+" ");
    }
  }
}