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
