package hexlet.code;

import hexlet.code.enums.UserChoice;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
            case GREETING -> Engine.greetingToTheUser();
            case EVEN -> Engine.start(Even.getRoundText(), Even.prepareData(Engine.getNumberRounds()));
            case CALC -> Engine.start(Calculator.getRoundText(), Calculator.prepareData(Engine.getNumberRounds()));
            case GCD -> Engine.start(Gcd.getRoundText(), Gcd.prepareData(Engine.getNumberRounds()));
            case PROGRESSION ->
                    Engine.start(Progression.getRoundText(), Progression.prepareData(Engine.getNumberRounds()));
            case PRIME -> Engine.start(Prime.getRoundText(), Prime.prepareData(Engine.getNumberRounds()));
            default -> throw new RuntimeException("Unknown game");
        }
    }
}


