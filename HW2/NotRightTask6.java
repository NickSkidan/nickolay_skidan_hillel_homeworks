public class NotRightTask6 {
    public static void main(String[] args) {
        int[] nums = {11, 234, 9876, 356765, 1209875, 12, 9089867, 9, 13577654};
        int min = 10, max = 0;
        String MinNum = null, MaxNum = null;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() < min) {
                min = str.length();
                MinNum = str;
            }
            if (str.length() > max) {
                max = str.length();
                MaxNum = str;
            }
        }
        System.out.println("Самое короткое число массива - это " + MinNum + ", состоящее из " + min + " цифр.");
        System.out.println("Самое длинное число массива - это " + MaxNum + ", состоящее из " + max + " цифр.");
    }
}
