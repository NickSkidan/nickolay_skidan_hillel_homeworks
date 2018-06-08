public class Football extends Sport implements GameWithBall, Athletics {
    String footballTeamName;

    Football(int numberOfPlayers, int popularity, int eventDuration, int sportsmanSalary, String finalAim, String footballTeamName) {
        super(numberOfPlayers, popularity, eventDuration, sportsmanSalary, finalAim);
        this.footballTeamName = footballTeamName;
    }

    Football() {
        super();
    }

    @Override
    public void score() {
        System.out.println("Make the ball be in the opponent's goal");
    }

    @Override
    public void kick() {
        System.out.println("Kick the ball by foot");
    }

    @Override
    public void change() {
        System.out.println("Leave the area in order to come in another player");
    }

    @Override
    public void dribble() {
        System.out.println("Dribble the ball by foot");
    }

    @Override
    public void jump() {
        System.out.println("Football players are jumping to reach the ball when it's in the air");
    }

    @Override
    public void run() {
        System.out.println("Football players run to reach the ball or opponent's goal faster then the opponent");
    }

    @Override
    void statistics() {
        System.out.println(numberOfPlayers + " players play football");
        System.out.println(popularity + " people are followers of the " + footballTeamName + " in Instagram");
        System.out.println("One football game lasts " + eventDuration + " minutes");
        System.out.println(footballTeamName + "'s football player average salary is " + sportsmanSalary + " dollars per year");
        System.out.println("The ultimate aim of " + footballTeamName + " is" + finalAim);
    }

    @Override
    String win() {
        return "Score more goals, than opposing team";
    }

    @Override
    String birthplace() {
        return "Football was invented in England";
    }
}
