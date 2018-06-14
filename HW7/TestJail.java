public class TestJail {
    public static void main(String[] args) {
        Jail alcatraz = new Jail();
        alcatraz.prisoners = new String[2];
        alcatraz.id = new int[1];
        alcatraz.putPrisoner();
        alcatraz.makeID();
        alcatraz.identifyPrisoner();
    }
}
