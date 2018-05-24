public class Task7 {
    public static boolean isDifferentDigigts(int num) {
        int digits[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean isDifDig = true;
        int index;
        while (num != 0) {
            index = num % 10;
            num /= 10;
            digits[index] += 1;
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 1) {
                isDifDig = false;
                break;
            }
        }
        return isDifDig;
    }

    public static void main(String[] args) {
        int[] nums = {567890, 124, 6, 24756038, 72, 133, 99875, 8753, 92, 64057658, 886, 137, 874763};
        for (int number : nums) {
            if (isDifferentDigigts(number))
                System.out.println("Число " + number + " состоит из разных цифр.");
        }
    }
}