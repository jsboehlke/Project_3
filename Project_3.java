import java.util.*;
public class Project_3{
Scanner user_input = new Scanner(System.in);
static void myMethod1(String number) {System.out.println(number + " plus ten");}
static int myMethod2(int x, int y) {return x + y;}
static void myMethod3() {myMethod1("ten");System.out.println(myMethod2(10, 10));}
  public static void main(String[] args) {myMethod3();}
}