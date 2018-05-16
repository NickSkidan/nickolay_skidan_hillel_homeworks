public class Task3 {
    public static void main(String[] args) {
        boolean b;
        int[] nums = {-2, 15, 7, 65, 97, 132, 133, 1, 14, 13, 16, 17, 3, 94, 77, 81};
        for (int i : nums) {
            b = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
            if (b & (i > 1)) System.out.println(i + " простое");
        }
    }
}