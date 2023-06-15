import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Rolling dice...");
        int die1 = rollDice();
        int die2 = rollDice();
        int total = die1 + die2;
        
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

        if (total > 7) {
            System.out.println(name + " won!");
        }
        else{
            System.out.println(name + " lost!");
        }
    }

    
    
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
