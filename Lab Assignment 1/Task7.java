//Task-7
public class Task7{
  public static void main(String[]args){
    int minute = 24101247;
    int hour = minute/60;
    int day = hour/24;
    int year = day/365;
    int x = day-(year*365);
    System.out.println(minute+" minutes is approximately "+year+" years and "+x+" days ");
  }
}