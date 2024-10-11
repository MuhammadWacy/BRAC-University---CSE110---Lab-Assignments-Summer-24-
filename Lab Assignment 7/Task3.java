//Task-3

import java.util.Scanner;

public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int n = sc.nextInt();
    
    int[] arr1 = new int[n];
    
    for(int i=0; i<arr1.length; i++){
      System.out.println("Enter a number: ");
      arr1[i] = sc.nextInt();
    }
    
    int[] arr2 = new int[n];
    int order = 0;
    
    for(int j=(arr1.length-1); j>=0; j--){
      arr2[order] = arr1[j];
      order++;
    }
    
    System.out.println("Reversed using a new array: ");
    
    for(int k=0; k<arr2.length; k++){
      System.out.print(arr2[k]+" ");
    }
    System.out.println();
    
    for(int m=0; m<=(n/2); m++){
      int temp = arr1[m];
      arr1[m] = arr1[n-m-1];
      arr1[n-m-1] = temp;
    }
    
    System.out.println("Reversed the original array: ");
    
    for(int p=0; p<arr1.length; p++){
      System.out.print(arr1[p]+" ");
    }
    
    System.out.println();
  }
}