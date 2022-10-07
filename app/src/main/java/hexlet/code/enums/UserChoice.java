package hexlet.code.enums;

import hexlet.code.constant.GameName;

import java.util.Arrays;

public enum UserChoice {

    EXIT(0, GameName.EXIT),
    GREETING(1, GameName.GREETING),
    EVEN(2, GameName.EVEN),
    CALCULATOR(3, GameName.CALC),
    GCD(4, GameName.GCD),
    PROGRESSION(5, GameName.PROGRESSION),
    PRIME(6, GameName.PRIME);

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static String getNameGame(int userChoice) {
        return Arrays.stream(UserChoice.values())
                .filter(t -> t.getId() == userChoice)
                .map(UserChoice::getDescription)
                .findFirst().orElseThrow(() -> new RuntimeException("Game not found"));
    }

    UserChoice(int value, String descr) {
        this.id = value;
        this.description = descr;
    }
    private final int id;
    private final String description;


}


