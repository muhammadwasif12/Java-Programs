import java.util.Scanner;

public class Tut_13_Strings {
   public static void main(String[] args) {
    String name=new String("Muhammad Wasif");//first method
    String name1="Shah"; //seccond method
    System.out.println("First method: "+name);
    System.out.println("Second method: "+name1);
   
    Scanner scr =new Scanner(System.in);
    String hello=scr.next();//it prints only first word.
    System.out.println(hello);
    String hello1=scr.nextLine();//it prints whole line.
    System.out.println(hello1);
    scr.close();

    int a=34;
    float b=45.6f;
    System.out.printf("The value of a is %d and value of b is %9.9f",a,b);
    //by using printf we can print our values in string by using %d,f and etc.
}

}
