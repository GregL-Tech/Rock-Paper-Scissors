import java.util.Scanner;

public class Player {
    private int choice;

    public void setPcChoice()
    {
        Scanner askChoice = new Scanner(System.in);
        do
        {
            System.out.println("Pick your Choice");
            String pcChoice = askChoice.nextLine();
            for (int i = 0, len = Config.CHOICES.length; i < len; i++)
            {
                if (pcChoice.equalsIgnoreCase(Config.CHOICES[i]))
                {
                    this.choice = i;
                    break;
                }
                else
                {
                    this.choice = -1;
                }
            }
            if (this.choice < 0 || this.choice > 2)
            {
                System.out.println("Please type either ROCK, PAPER, or SCISSORS");
            }
        }
        while (this.choice < 0 || this.choice > 2);
        askChoice.close();
    }

    public int setNpcChoice()
    {
        double rand = Math.random();
        if (rand < 0.333)
        {
            this.choice = 0;
            return 0;
        }
        else if (rand < 0.666)
        {
            this.choice = 1;
            return 0;
        }
        else
        {
            this.choice = 2;
            return 0;
        }
    }

    public int getChoice()
    {
        return this.choice;
    }
}
