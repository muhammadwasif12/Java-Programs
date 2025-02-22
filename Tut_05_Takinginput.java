import java.util.Scanner;

public class Tut_05_Takinginput {

    public static void main(String[] args){
    System.out.println("Taking inputs from the user: ");
    Scanner sc =new Scanner(System.in);    //is use for taking inputs from the user.
    
    /*
    System.out.println("Enter value of number 1: ");
    int a=sc.nextInt();  //in this way we store user value in variable a.
    System.out.println("Enter value of number 2: ");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("The Result is: "+sum);
    */

    boolean c=sc.hasNextInt();  //if value is integer then it shows true otherwise false.
    System.out.println(c);     //hasNextint is use for verifying that value is integer.
    String str=sc.next();     //it shows string data but display firt word of line.
    System.out.println(str);
    
    //so for dispaly full line of string we use nextline:
    String str1=sc.nextLine();  //now it prints whole line.
    System.out.println(str1);

    sc.close();  //it is use for closing scanner class.
}
}