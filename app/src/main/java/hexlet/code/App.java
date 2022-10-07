package hexlet.code;

import hexlet.code.enums.UserChoice;

import java.util.Scanner;

import static hexlet.code.constant.GameName.CALC;
import static hexlet.code.constant.GameName.EVEN;
import static hexlet.code.constant.GameName.EXIT;
import static hexlet.code.constant.GameName.GCD;
import static hexlet.code.constant.GameName.GREETING;
import static hexlet.code.constant.GameName.PRIME;
import static hexlet.code.constant.GameName.PROGRESSION;

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
        String gameName = UserChoice.getNameGame(userChoice);

        switch (gameName) {
            case EXIT -> System.exit(1);
            case GREETING -> Cli.greetingToTheUser();
            case EVEN -> {
                Cli.greetingToTheUser();
                Engine.gameStartEven(Cli.getUsername());
            }
            case CALC -> {
                Cli.greetingToTheUser();
                Engine.gameStartCalc(Cli.getUsername());
            }
            case GCD -> {
                Cli.greetingToTheUser();
                Engine.gameStartGcd(Cli.getUsername());
            }
            case PROGRESSION -> {
                Cli.greetingToTheUser();
                Engine.gameStartProgression(Cli.getUsername());
            }
            case PRIME -> {
                Cli.greetingToTheUser();
                Engine.gameStartPrime(Cli.getUsername());
            }
            default -> throw new RuntimeException("unknown game");
        }
    }
}


