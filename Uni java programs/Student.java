import java.util.Scanner;

public class Student {
    public static void main(String[] args){
    int sum =0;
        for (int i = 0; i < 5; i++) {
    System.out.println("Enter marks of Subject "+i+" is: ");
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    sum=sum+a;
        }
    
      double  Percentage=(sum/500.0)*100;

        System.out.println("The Percentage of Student is: "+Percentage+"%");
    }

}

