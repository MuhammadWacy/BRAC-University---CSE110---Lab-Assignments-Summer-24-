//Task-6
public class Task6{
  public static void main(String[]args){
   //6.a)
    int a = 3;
    int b = 4;
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);
    //6.b)
    a = a+b;
    b = a - b;
    a = a-b;
    System.out.println(a);
    System.out.println(b);
  }
}