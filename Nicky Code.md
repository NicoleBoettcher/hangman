# hangman

public static String randomWord ()
    {
       
        Random randy = new Random();
        
        String originalWord;

        //String[] randomWords = new String[52];
 
        String [] randomWords = new String[] {"hello", "purple", "green", "toast", "computer", "mood", "window", "keyboard",            "science", "fluffy", "email",  "glasses", "water", "jug", "chicken", "weather", "happiness", "sisters", "cleaning",             "travel", "winning", "wedding", "easter", "halloween", "forest", "fireplace", "existence", "universe", "genetics",            "voyagers", "swimming", "waves", "internet", "change", "school", "routine", "coffee crisp", "what's up hommie",               "bright side", "mean girls", "picture frame", "life after death", "getting a pet", "i need money!", "haunted dreams",           "cable lines", "fire and water boy", "something special", "dad's car", "girls' bikes", "i'm yelling timber!",               "walking on sunshine!"};
        
        int x = randy.nextInt(randomWords.length);
        
        originalWord = randomWords[x];
        
        return originalWord;
        
    }
    
    public static void print ()
    {
        String wrongGuesses = ("hello123");
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
