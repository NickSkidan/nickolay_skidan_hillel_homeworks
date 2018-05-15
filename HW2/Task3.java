public class Task3 {
    public static void main(String[] args) {
        boolean b;
        int[] nums = {3, 15, 7, 65, 97, 132, 133, 14, 13, 16, 17, 94, 77, 81};
        for (int i : nums) {
            b = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
            if (b) System.out.println(i + " простое");
        }
    }
}