//Task-6

import java.util.Scanner;

public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length of the array: ");
    int n = sc.nextInt();
    double[] arr1 = new double[n];
    
    for(int i=0; i<arr1.length; i++){
      System.out.println("Enter a number : ");
      arr1[i] = sc.nextDouble();
    }
    
    double maximum = arr1[0];
    double minimum = arr1[0];
    double sum = 0;
    double avg = 0;
    int max_index = 0;
    int min_index = 0;
    
    for(int j=0; j<arr1.length; j++){
      if(arr1[j] > maximum){
        maximum = arr1[j];
        max_index = j;
      }else if(arr1[j] < minimum){
        minimum = arr1[j];
        min_index = j;
      }
      sum+=arr1[j];
    }
    
    avg = sum/(double)n;
    
    System.out.println("Maximum element "+maximum+" found at index "+max_index);
    System.out.println("Minimum element "+minimum+" found at index "+min_index);
    System.out.println("Summation : "+sum);
    System.out.println("Average: "+avg);
  }
}