package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case 0 -> System.exit(1);
            case 1 -> Cli.greetingToTheUser();
            case 2 -> {
                Cli.greetingToTheUser();
                Engine.gameStartEven(Cli.getUsername());
            }
            case 3 -> {
                Cli.greetingToTheUser();
                Engine.gameStartCalc(Cli.getUsername());
            }
            case 4 -> {
                Cli.greetingToTheUser();
                Engine.gameStartGcd(Cli.getUsername());
            }
            case 5 -> {
                Cli.greetingToTheUser();
                Engine.gameStartProgression(Cli.getUsername());
            }
            case 6 -> {
                Cli.greetingToTheUser();
                Engine.gameStartPrime(Cli.getUsername());
            }
            default -> throw new RuntimeException("unknown game");
        }
    }
}


