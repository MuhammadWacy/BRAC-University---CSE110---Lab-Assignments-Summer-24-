//Task-1

import java.util.Scanner;

public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    
    for(int i=0; i<arr1.length; i++){
      System.out.println("Enter a number : ");
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("The elements of the array are:");
    
    for(int j=0; j<arr1.length; j++){
      System.out.println(j+": "+arr1[j]);
    }
    
    System.out.println("Enter another number : ");
    
    int[] arr2 = new int[n+1];
    arr2[n] = sc.nextInt();
    
    for(int k=0; k<arr1.length; k++){
      arr2[k] = arr1[k];
    }
    
    System.out.println("After resizing the array: ");
    
    for(int l=0; l<arr2.length; l++){
      System.out.print(arr2[l]+" ");
    }
  }
}