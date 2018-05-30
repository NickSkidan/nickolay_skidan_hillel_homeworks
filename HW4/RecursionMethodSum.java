public class RecursionMethodSum {
    public static int recursionSum(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + recursionSum(n / 10);
    }
}
