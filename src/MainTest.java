import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void numberOfVowels() {
        String one = "let him cook";
        String two = "relax, you're doing fine";
        String three = "aaaaah!!!";
        assertTrue(Main.numberOfVowels(one) == 4);
        assertTrue(Main.numberOfVowels(two) == 9);
        assertTrue(Main.numberOfVowels(three) == 5);
    }

    @org.junit.jupiter.api.Test
    void notDivisible() {
        assertTrue(Main.notDivisibleBy235(5) == 1);
        assertTrue(Main.notDivisibleBy235(10) == 2);
        assertTrue(Main.notDivisibleBy235(100) == 26);
        assertTrue(Main.notDivisibleBy235(1000) == 266);
    }

    @org.junit.jupiter.api.Test
    void toCamelCase() {
        String one = "the-stealth-warrior";
        String two = "The_Stealth_Warrior";
        String three = "The_Stealth-Warrior";
        String four = "-no_shot_bruh_";
        assertTrue(Main.toCamelCase(one).equals("theStealthWarrior"));
        assertTrue(Main.toCamelCase(two).equals("TheStealthWarrior"));
        assertTrue(Main.toCamelCase(three).equals("TheStealthWarrior"));
        assertTrue(Main.toCamelCase(four).equals("NoShotBruh"));
    }
}