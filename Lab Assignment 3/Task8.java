//Task-8

import java.util.Scanner;

public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter BRACU Student ID : ");
    int sid = sc.nextInt();
    int year = sid/1000000;
    int rem = sid%1000000;
    int sem = rem/100000;
    
    if(sem == 1){
      System.out.println("Student Joined BRAC in Spring "+year);
    }
    else if(sem == 2){
      System.out.println("Student Joined BRAC in Fall "+year);
    }
    else if(sem == 3){
      System.out.println("Student Joined BRAC in Summer "+year);
    }
  }
}