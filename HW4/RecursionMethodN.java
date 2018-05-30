public class RecursionMethodN {
    public static String recursionN(int n) {
        if (n == 1)
            return "1";
        return recursionN(n - 1) + " " + n;
    }
}
