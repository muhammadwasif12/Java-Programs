import java.util.Scanner;

public class Tut_06_CalculatePercentage{
public static void main(String[] args){
double Percentage;

Scanner obj=new Scanner(System.in);

System.out.println("Enter marks of math: ");
int a=obj.nextInt();

System.out.println("Enter marks of Physics: ");
int b=obj.nextInt();

System.out.println("Enter marks of Biology: ");
int c=obj.nextInt();

System.out.println("Enter marks of English: ");
int d=obj.nextInt();

System.out.println("Enter marks of Urdu: ");
int e=obj.nextInt();

int Totalmarks =a+b+c+d+e;
Percentage=(Totalmarks/500.0)*100;

System.out.println("Your Total Marks is: "+Totalmarks);
System.out.println("The Total Percentage of Student is: "+Percentage+"%");

if (Percentage>90) {
    System.out.println("Your Grade is A");
}
else if (Percentage>80) {
    System.out.println("Your Grade is: B");
}
else if(Percentage>70){
System.out.println("Your Grade is: C");
}
else{
    System.out.println("Your Grade is D");
}
obj.close();
}

}