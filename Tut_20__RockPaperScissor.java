import java.util.Random;
import java.util.Scanner;
//import java.util.random.*;

public class Tut_20__RockPaperScissor {
    public static void main(String[] args) {

        Random random1 = new Random(); // we made object of random.
        String[] arr = { "Rock", "Paper", "Scissor" }; // we made array
        int randomnumber = random1.nextInt(arr.length); // we store random number in randomnumber.
        String ComputerChoice = arr[randomnumber]; // we simply store array element in Randomelement.
        int player = 0;
        int computer = 0;
        System.out.println("Game: |||||Rock Paper Scissor|||||");

        for (int i = 0; i < 3; i++) {
            System.out.println("    Player vs Computer   ");
            System.out.println("Player First: ");
            Scanner objScanner = new Scanner(System.in);
            String p1 = objScanner.next();
            System.out.println("Computer : ");
            System.out.println(ComputerChoice);

            if (p1.equalsIgnoreCase(ComputerChoice)) {
                System.out.println("Its a Tie!!!");
            }

            // Check if the player wins
            else if ((p1.equals("Rock") && ComputerChoice.equals("Scissor")) ||
                    (p1.equals("Paper") && ComputerChoice.equals("Rock")) ||
                    (p1.equals("Scissor") && ComputerChoice.equals("Paper"))) {
                System.out.println("Player wins!");
                player = player + 1;
            }
            // Otherwise, computer wins
            else if ((ComputerChoice.equals("Rock") && p1.equals("Scissor")) ||
                    (ComputerChoice.equals("Paper") && p1.equals("Rock")) ||
                    (ComputerChoice.equals("Scissor") && p1.equals("Paper"))) {
                System.out.println("Computer wins!");
                computer = computer + 1;
            } else {
                System.out.println("Please enter a valid choice: Rock, Paper, or Scissor.");
            }
            System.out.println("player points: " + player + "\n" + "Computer points: " + computer);

           // objScanner.close();//if u use for loop then it made comment.
        }
        System.out.print("Who wins the Three Match Series: ");
        if (player == computer) {
            System.out.println("Its Tie the series!!");
        } else if (player > computer) {
            System.out.println("player wins the Series!!");

        } else {
            System.out.println("Computer wins the series!!");
        }

    }
}