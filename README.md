# Java Scrabble Word Analyzer

## Project Overview

The Java Scrabble Word Analyzer is an object-oriented programming project designed to simulate key components of the Scrabble word game. The application generates random letter tiles, analyzes possible word combinations, and calculates word scores based on traditional Scrabble letter values.

Developed as part of my Computer Science coursework at Western University, this project demonstrates fundamental Java programming concepts, including object-oriented design, arrays, string manipulation, file handling, and algorithmic problem-solving.

## Key Features

- **Random Tile Generation:** Generates seven random letter tiles to represent a Scrabble player's available letters.
- **Tile Management:** Stores and manages individual letter tiles using a custom Java class.
- **Word Validation:** Contains functionality to identify valid words that can be formed using the available letters and an external dictionary.
- **Scrabble Scoring:** Calculates word scores using standard Scrabble letter point values.
- **Score Sorting:** Organizes calculated word scores in ascending order.
- **Tile Comparison:** Compares collections of tiles regardless of their original order.
- **Object-Oriented Design:** Uses constructors, encapsulation, methods, and class interactions to organize the application.

## Technologies Used

- **Programming Language:** Java
- **Programming Paradigm:** Object-Oriented Programming (OOP)
- **Data Structures:** Arrays and ArrayLists
- **Java Libraries:** java.util and java.io
- **Concepts:** Algorithms, String Manipulation, File Handling, Encapsulation, and Data Processing

## Project Structure

**Scrabble.java**

Implements the primary Scrabble functionality, including:

- Managing collections of letter tiles
- Retrieving available letters
- Finding dictionary words using available tiles
- Calculating and sorting Scrabble word scores
- Comparing Scrabble tile collections

**Tile.java**

Represents individual Scrabble tiles and handles letter generation and tile-related functionality.

## Dictionary Dependency

**Important:** This repository does not include the external dictionary file `CollinsScrabbleWords2019.txt`.

The original implementation was designed to read a dictionary file to determine which valid English words could be created using the available Scrabble tiles.

As a result:

- Tile generation and management do not require the dictionary.
- Tile comparison does not require the dictionary.
- Dictionary-based word searching requires the external file.
- Word scoring depends on the words retrieved from the dictionary.

To enable dictionary-based functionality, a compatible word list must be provided using the filename `CollinsScrabbleWords2019.txt` in the application's working directory.

The dictionary is excluded from this repository because it was not available for redistribution.

## How the Program Works

1. A Scrabble object is created with seven randomly generated letter tiles or a provided collection of tiles.
2. The program retrieves the letters from the tile collection.
3. When a compatible dictionary is available, the program examines the dictionary to determine which words can be formed.
4. Valid words are evaluated using Scrabble letter point values.
5. Calculated scores are sorted in ascending order.

**Note:** The repository contains the core Scrabble classes rather than a complete standalone application. A separate driver class with a `main()` method is needed to run an interactive demonstration.

## Skills Demonstrated

Through this project, I strengthened my understanding of:

- Object-oriented programming in Java
- Class design and encapsulation
- Arrays and ArrayLists
- String processing and character manipulation
- File reading and exception handling
- Algorithmic thinking and conditional logic
- Sorting and comparison operations
- Modular software development

## Future Improvements

Potential enhancements include:

- Replacing the external dictionary dependency with a freely licensed word list
- Creating a complete command-line interface
- Adding an interactive Scrabble game board
- Implementing automated unit tests
- Improving word-search efficiency
- Adding a graphical user interface

## Author

**Arber Aliu**  
Computer Science Student  
Western University

*An academic Java project demonstrating object-oriented programming, data structures, and algorithmic problem-solving.*
