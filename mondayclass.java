import java.util.Scanner;
class Factorial
{
    int f;
    Factorial(int f)
    {
        this.f = f;
    }

    void display() {
        int c = 1;
        for (int i = 1; i <= f; i++)
        {
            c *= i;
        }
        System.out.println("Factorial of " + f + " is: " + c);
    }
}
public class mondayclass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int f = scanner.nextInt();

        Factorial factorialObject = new Factorial(f);
        factorialObject.display();
        scanner.close();
    }
}
 
