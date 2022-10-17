package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetingToTheUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        String greetings = "Hello, %s!";
        System.out.println(String.format(greetings, username));
    }

}
