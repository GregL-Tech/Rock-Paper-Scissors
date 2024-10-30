class RPS {
    public static void main(String args[])
    {
        System.out.println(Config.printRules());

        Player pc = new Player();
        Player npc = new Player();

        pc.setPcChoice();
        npc.setNpcChoice();

        System.out.println("I chose: " + Config.CHOICES[npc.getChoice()]);
        System.out.println(
            Config.printOutcome(Config.calculateWinner(pc.getChoice(), npc.getChoice())));
    }
}
