import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Rolling dice...");
        int die1 = rollDice();
        int die2 = rollDice();
        int total = die1 + die2;
        
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);
    }
    
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
