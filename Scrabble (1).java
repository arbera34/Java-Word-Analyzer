
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


// This part declares the Scrabble class and an array of the tile objects
public class Scrabble {
    private Tile tiles[];

    // This part generates 7 random tiles for our code
    
    public Scrabble() {

        // This process initializes the array looping 7 times and finally  assign a random tile to each position

        tiles = new Tile[7];
        for (int i = 0; i < 7; i++) {
            tiles[i] = new Tile();
        }
    }

    //This is a Constructor that takes in an array of tiles
    
    public Scrabble(Tile[] tiles) {

         // assigns the passed-in array to this.tiles

        this.tiles = tiles;
    }

    
    //// This part consists of a Method that gets all letters from the tile array as a string

    public String getLetters() {
        StringBuilder letterList = new StringBuilder();
        for (int i = 0; i < tiles.length; i++) {         // // This part means for each tile in the tiles array
            
            // appends its letter to the StringBuilder

             letterList.append(tiles[i].getLetter());
        }
        return letterList.toString();   //// returns final string
    }

    // This part finds all words from the dictionary file that can be formed using the tiles
   
    public ArrayList<String> getWords() throws FileNotFoundException {
        ArrayList<String> spellableWords = new ArrayList<>();  // list that is able to store all valid words
        try (BufferedReader br = new BufferedReader(new FileReader("CollinsScrabbleWords2019.txt"))) {
            String word;

            // //The program reads each word from the dictionary file, converts it to uppercase for consistent comparison, retrieves the available letters from the player's tiles, and initially assumes the word can be spelled using those letters.

            while ((word = br.readLine()) != null) {
                word = word.toUpperCase();  
                String validLetters = getLetters();
                boolean spellable = true;

                for (int i = 0; i < word.length(); i++) {

                    //checks each letter in the word and retrieves the letter

                    char letter = word.charAt(i);

                    // if statement is valid if the letter exists in validLetters

                    if (validLetters.indexOf(letter) != -1) {
                        validLetters = validLetters.replaceFirst(String.valueOf(letter), "");
                    } else {
                        spellable = false;
                        break;
                    }
                }

                // if the word is spellable we must add it to the list

                if (spellable) {
                    spellableWords.add(word);
                }
            }

            // prints IO error if the file cannot be read

        } catch (IOException e) {
            e.printStackTrace();
        }
        return spellableWords;
    }

    
    //// Method to calculate scores for each spellable word

    public int[] getScores() throws FileNotFoundException {

        // get list of valid words and creates an array to store scores

        ArrayList<String> spellableWords = this.getWords();
        int[] wordScores = new int[spellableWords.size()];

        for (int i = 0; i < spellableWords.size(); i++) {
            String word = spellableWords.get(i);
            int score = 0;

            //// for each letter in word it adds its Scrabble score

            for (char c : word.toCharArray()) {
                score += getLetterValue(c);
            }
            wordScores[i] = score;
        }

        // sort scores in ascending order and concludes with a return of a sorted array

        Arrays.sort(wordScores);
        return wordScores;
    }

    


    

    private int getLetterValue(char letter) {
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'L' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'T' || letter == 'U') {
            return 1;
        } else if (letter == 'D' || letter == 'G') {
            return 2;
        } else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
            return 3;
        } else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            return 4;
        } else if (letter == 'K') {
            return 5;
        } else if (letter == 'J' || letter == 'X') {
            return 8;
        } else if (letter == 'Q' || letter == 'Z') {
            return 10;
        } else {
            throw new IllegalArgumentException("Invalid Scrabble letter: " + letter);
        }
    }

    // Compares Scrabble objects based on letters
      public boolean equals(Scrabble s) {
        char[] x = this.getLetters().toCharArray();
        char[] y = s.getLetters().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}