import java.util.Scanner;
import java.util.Random;
/**
 * Hangman game.
 * 
 * @Jonathan, Nickey, Eve 
 * @21/03/1
 */
public class HangmanJonathan
{   
    static int numberOfLines = 31; // the size of the screen in lines on the console, used in printResizeScreen()
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String originalWord = "";
        System.out.println("Resize your screen so that all the '@' signs fit in and then press enter");
        printResizeScreen();
        String confirmation = sc.nextLine();
        clearScreen(); 

        System.out.println("Write type 'm' for multiplayer or 's' for single player and press");
        System.out.println("enter to confirm your decision");

        confirmation = sc.nextLine();

        if (confirmation ==  "m" || confirmation == "M")
        {
            System.out.println("Type in the word you want your friend to guess and press enter, the word will be guessed exactly");

            originalWord = sc.nextLine(); // the original word will be inputted and the scores of hte two player will be initialized
            int player1Score = 0;
            int player2Score = 0;
        }
        else if (confirmation ==  "s" || confirmation == "S")
        {
            originalWord = randomWord(); // a word chosen at random from 50 words
        }
        else
        {
            System.out.println("You didn't input the correct thing! SINGLE PLAYER FOR YOU!!");
            originalWord = randomWord(); // a word chosen at random from 50 words
        }
        
        clearScreen();

        char[] newWord = new char[originalWord.length()]; // the word that is being actively updated by the new user inputs
        String wrongGuesses = "ABCDRGT"; //  A string containing all of the wrong guesses, without spaces
        String guessedLetter = "A"; // The most recent letter that the user guessed

    }
    
    
    public static void printResizeScreen()
    {
        // prints the number of lines of the screen minus 1 in @ signs, the number of @ signs is manual at the moment
        for (int i = 0; i < numberOfLines - 1; i++)
        {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }

    }

    public static boolean hasBeenGuessed(String guessedLetter, String wrongGuesses)
    {
        for (int i = 0; i < wrongGuesses.length(); i++)
        {
            if (guessedLetter == Character.toString(wrongGuesses.charAt(i)))
            {
                return true;
            }
        }

        return false;

    }

    public static void clearScreen() 
    {  
        for (int i = 0; i < 10000; i++)
        {
            System.out.println();
        }
    }

    public static String randomWord ()
    {

        Random randy = new Random();

        String originalWord;

        //String[] randomWords = new String[52];

        String [] randomWords = new String[] {"hello", "purple", "green", "toast", "computer", "mood", "window", "keyboard", 
                "science", "fluffy", "email",  "glasses", "water", "jug", "chicken", "weather", "happiness", "sisters", "cleaning",
                "travel", "winning", "wedding", "easter", "halloween", "forest", "fireplace", "existence", "universe", "genetics",
                "voyagers", "swimming", "waves", "internet", "change", "school", "routine", "coffee crisp", "what's up hommie",
                "bright side", "mean girls", "picture frame", "life after death", "getting a pet", "i need money!", "haunted dreams",
                "cable lines", "fire and water boy", "something special", "dad's car", "girls' bikes", "i'm yelling timber!",
                "walking on sunshine!"};

        int x = randy.nextInt(randomWords.length);

        originalWord = randomWords[x];

        return originalWord;

    }

    public static void printASCII(String wrongGuesses)
    {
        //String wrongGuesses = ("hello123");
        //String slash = ("\\");

        if (wrongGuesses.length() == 0)
        {System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() == 1)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==2)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|           |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==3)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==4)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==5)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|\\");
            System.out.println("|           |");
            System.out.println("|");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==6)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|\\");
            System.out.println("|           |");
            System.out.println("|          /");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==7)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|\\");
            System.out.println("|           |");
            System.out.println("|          / |");
            System.out.println("|___");
        }
        if (wrongGuesses.length() ==8)
        {
            System.out.println("____________");
            System.out.println("|           |"); 
            System.out.println("|           O");
            System.out.println("|          /|\\");
            System.out.println("|           |");
            System.out.println("|          / \\");
            System.out.println("|___");
            System.out.println("YOU LOOSE!!");
        }
    }
}
