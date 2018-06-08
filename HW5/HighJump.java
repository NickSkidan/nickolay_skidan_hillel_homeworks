public class HighJump extends Sport implements Athletics {
    String name;

    HighJump(int numberOfPlayers, int popularity, int eventDuration, int sportsmanSalary, String finalAim, String name) {
        super(numberOfPlayers, popularity, eventDuration, sportsmanSalary, finalAim);
        this.name = name;
    }

    HighJump() {
        super();
    }

    @Override
    public void jump() {
        System.out.println("High jumpers jump above the bar");
    }

    @Override
    public void run() {
        System.out.println("High jumpers run to push stronger off the ground");
    }

    @Override
    void statistics() {
        System.out.println(numberOfPlayers + " high jumpers participate in competition");
        System.out.println(popularity + " people knows about such a sportsman as " + name);
        System.out.println("One high jump of " + name + " takes about " + eventDuration + " seconds");
        System.out.println(name + "'s average salary is " + sportsmanSalary + " dollars per year");
        System.out.println(name + "'s ultimate aim is " + finalAim);
    }

    @Override
    String win() {
        return "Jump higher than the opponents";
    }

    @Override
    String birthplace() {
        return "The high jump became a sport in ancient Greece";
    }
}
