public abstract class Sport {
    int numberOfPlayers;
    int popularity;
    int eventDuration;
    int sportsmanSalary;
    String finalAim;

    Sport(int numberOfPlayers, int popularity, int eventDuration, int sportsmanSalary, String finalAim) {
        this.numberOfPlayers = numberOfPlayers;
        this.popularity = popularity;
        this.eventDuration = eventDuration;
        this.sportsmanSalary = sportsmanSalary;
        this.finalAim = finalAim;
    }

    Sport() {

    }

    abstract void statistics();

    abstract String win();

    abstract String birthplace();
}
