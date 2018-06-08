public class TestSport {
    public static void main(String[] args) {
        Football football1 = new Football();
        football1.change();
        football1.dribble();
        football1.kick();
        football1.score();
        football1.run();
        football1.jump();
        System.out.println();
        football1.footballTeamName = "Real Madrid";
        football1.sportsmanSalary = 10_000_000;
        football1.eventDuration = 90;
        football1.finalAim = " to win the Champion's league";
        football1.numberOfPlayers = 22;
        football1.popularity = 35_000_000;
        Football football2 = new Football(22, 1_500_000, 90, 2_000_000, " to win Ukrainian championship", "Shakhtar Donetsk");
        football1.statistics();
        System.out.println();
        football2.statistics();

        System.out.println();

        HighJump highJump1 = new HighJump();
        highJump1.run();
        highJump1.jump();
        System.out.println();
        highJump1.name = "John Thomas";
        highJump1.eventDuration = 5;
        highJump1.sportsmanSalary = 100_000;
        highJump1.finalAim = "to win the Olympic Games";
        highJump1.popularity = 1_000_000;
        highJump1.numberOfPlayers = 15;
        HighJump highJump2 = new HighJump(15, 9000, 3, 10_000, "to qualify to the World Championship", "Dikembe Mutombo");
        highJump1.statistics();
        System.out.println();
        highJump2.statistics();

        System.out.println();

        Sport sport1 = new Football();
        Sport sport2 = new HighJump();
        Sport[] sports = new Sport[2];
        sports[0] = football1;
        sports[1] = highJump1;
        for (Sport typeOfSport: sports) {
            System.out.println(typeOfSport.birthplace());
        }

        System.out.println();

        for (Sport typeOfSport: sports){
            System.out.println(typeOfSport.win());
        }
    }
}
