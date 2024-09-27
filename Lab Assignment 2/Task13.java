//Task-13
public class Task13{
  public static void main(String[]arg){
    int hour = 5;
    int minute = 56;
    int second = 23;
    double total_hour = hour + minute/60 + ((second/60)/60);
    int meter = 2500;
    double km = meter/1000;
    double mile = meter/1609;
    double m1 = km/total_hour;
    double m2 = mile/total_hour;
    System.out.println("Your velocity in km/h is " + m1);
    System.out.println("Your velocity in miles/h is "+ m2);
  }
}