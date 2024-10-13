//Task-8

import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the length of array 1: ");
    
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    
    System.out.println("Please enter the elements of the arr1: ");
    
    for(int i=0; i<arr1.length; i++){
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("Please enter the length of array 2: ");
    
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    
    System.out.println("Please enter the elements of the arr2: ");
    
    for(int j=0; j<arr2.length; j++){
      arr2[j] = sc.nextInt();
    }
    
    int count_1 = 0;
    
    for(int x=0; x<arr1.length; x++){
      int d = arr1[x];
      int count = 0;
      for(int y=0; y<arr2.length; y++){
        if(d == arr2[y]){
          count++;
        }
      }
      if(count > 0){
        count_1++;
      }
    }
    
    if(count_1 == arr2.length){
      System.out.println("Array 2 is a subset of Array 1.");
    }else{
      System.out.println("Array 2 is not a subset of Array 1.");
    }
  }
}