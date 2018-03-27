import java.util.Scanner;
/**
 * Hangman game.
 * 
 * @Jonathan, Nickey, Eve 
 * @21/03/1
 */
public class HangmanJonathan
{   
    Scanner sc = new Scanner(System.in);
    String originalWord = randomWord(); // a word chosen at random from 50 words
    char[] newWord = new char[originalWord.length()]; // the word that is being actively updated by the new user inputs
    String wrongGuesses = ""; //  A string containing all of the wrong guesses, without spaces
    char guessedLetter = 'A'; // The most recent letter that the user guessed

    public void main(String args[])
    {
        
        // code to resize the scren to the appropriate sign 
        System.out.println("Resize your screen so that the all of the '@' signs fit and then type a and press enter.");
        printResizeScreen();
        String confirmation = sc.next();
        if (confirmation == "a")
        {
            clearScreen();
        }

        


    }

    public String randomWord()
    {
        return "hello";
    }

    public static void printResizeScreen()
    {

        for (int i = 0; i < 30; i++)
        {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
