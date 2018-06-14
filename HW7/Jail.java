import java.util.*;

public class Jail {
    static String[] prisoners;
    static String[] id;
    static Scanner scn = new Scanner(System.in);
    static final int MIN_NAME_LENGTH = 2;
    static final int ID_LENGTH = 4;
    static boolean isNameCorrect = true, isIDCorrect = true;

    public static void putPrisoner() {
        System.out.println("Put men in prison");
        while (isNameCorrect) {
            for (int i = 0; i < prisoners.length; i++) {
                try {
                    prisoners[i] = scn.nextLine();
                    if (prisoners[i].length() < MIN_NAME_LENGTH)
                        throw new ArrayStoreException();
                    isNameCorrect = false;
                } catch (ArrayStoreException e) {
                    System.out.println("Prisoner's name must included two letters at least ");
                }
            }
        }
    }

    public static void makeID() {
        System.out.println("Give the prisoner ID");
        while (isIDCorrect) {
            for (int i = 0; i < id.length; i++) {
                try {
                    id[i] = scn.nextLine();
                    if (id[i].length() != ID_LENGTH)
                        throw new ArrayStoreException();
                    isIDCorrect = false;
                } catch (ArrayStoreException e) {
                    System.out.println("Prisoner's id consisits of 4 digits");
                }
            }
        }
    }

    public static void identifyPrisoner() {
        for (int i = 0; i < prisoners.length; i++) {
            try {
                System.out.println("Prisoner " + prisoners[i] + " gets id " + id[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Too many prisoners, we haven't enough id for them");
            }
        }
    }
}

