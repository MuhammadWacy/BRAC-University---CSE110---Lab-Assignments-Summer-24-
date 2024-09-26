//Task-12
public class Task12{
  public static void main(String[]args){
    int studentID = 24101247;
    int last = studentID%100;
    int firstdigit = last/10;
    int lastdigit = last%10;
    System.out.println(lastdigit);
    System.out.println(firstdigit);
  }
}