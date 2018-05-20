public class Task6 {
    public static void main(String[] args) {
        int[] nums = {11, 234, 9876, 356765, 1209875, 12, 9089867, 9, 13577654};
        int countArray[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            while (num != 0) {
                num /= 10;
                count++;
            }
            countArray[i] = count;
        }
        int min = countArray[0];
        int max = countArray[0];
        int minNum = nums[0];
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < countArray.length; j++) {
                if (countArray[j] < min) {
                    min = countArray[j];
                    minNum = nums[j];
                }
                if (countArray[j] > max) {
                    max = countArray[j];
                    maxNum = nums[j];
                }
            }
        }
        System.out.println("Самое короткое число: " + minNum + ", его длина: " + min);
        System.out.println("Самое длинное число: " + maxNum + ", его длина: " + max);
    }
}
