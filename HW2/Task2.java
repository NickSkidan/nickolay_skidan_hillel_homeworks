public class Task2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 14, 6, 5, 90, 103};
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 0) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println(" - четные числа из массива");
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) != 0) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.print(" - нечетные числа из массива");
    }
}
