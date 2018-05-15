public class Task4 {
    public static void main(String[] args) {
        int FibNums[] = new int[20];
        FibNums[0] = 1;
        FibNums[1] = 1;
        for (int i = 2; i < FibNums.length; i++) {
            FibNums[i] = FibNums[i - 1] + FibNums[i - 2];
        }
        System.out.print(" Первые 20 чисел последовательности Фибоначчи: ");
        for (int i = 0; i < FibNums.length; i++) {
            System.out.print(FibNums[i] + " ");
        }
    }
}
