//Task-5

import java.util.Scanner;

public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("N = ");
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    
    for(int i=0; i<arr1.length; i++){
      System.out.println("Enter a number : ");
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("Enter a number : ");
    int element = sc.nextInt();
    int count = 0;
    
    for(int j=0; j<arr1.length; j++){
      if(element == arr1[j]){
        System.out.println(element+" is at index "+j);
        count++;
      }
      }
    if(count == 0){
      System.out.println("Element not found");
    }
  }
}