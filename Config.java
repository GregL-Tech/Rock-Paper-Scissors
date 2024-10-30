public class Config {
    public static final String[] CHOICES = {"ROCK", "PAPER", "SCISSORS"};
    public static final String[] OUTCOMES = {"Tie", "You Win", "You lose"};

    public static String printRules()
    {
        return "Hello, Welcome to Rock, Paper, Scissors!";
    }

    public static int calculateWinner(int pcChoice, int npcChoice)
    {
        if (pcChoice == npcChoice)
        {
            return 0;
        }
        else if (pcChoice == 0 && npcChoice == 2 || pcChoice == 1 && npcChoice == 0 ||
                pcChoice == 2 && npcChoice == 1)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static String printOutcome(int winner)
    {
        return OUTCOMES[winner];
    }
}
