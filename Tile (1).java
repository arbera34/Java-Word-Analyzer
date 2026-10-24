import java.util.Random;

public class Tile {
    private char letter;

    // Default constructor: assigns a random letter
    public Tile() {
        this.letter = generateLetter();
    }

    // Constructor with specific letter
    public Tile(char c) {
        this.letter = Character.toUpperCase(c); // ensure uppercase
    }

    // Generates a random uppercase letter between A-Z
    private char generateLetter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'A');
    }

    // Getter method for the letter
    public char getLetter() {
        return this.letter;
    }
}
