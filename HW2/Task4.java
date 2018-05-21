public class Task4 {
    public static void main(String[] args) {
        int fibNums[] = new int[20];
        fibNums[0] = fibNums[1] = 1;
        for (int i = 2; i < fibNums.length; i++) {
            fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
        }
        System.out.print(" Первые 20 чисел последовательности Фибоначчи: ");
        for (int i = 0; i < fibNums.length; i++) {
            System.out.print(fibNums[i] + " ");
        }
    }
}
