public class Task5 {
    public static void main(String[] args) {
        int a[][] = {{1, 3, 6}, {4, -6, 9}, {-7, 12, 0}};
        int b[][] = {{0, 9, -3}, {14, 21, -5}, {8, 2, 6}};
        if (a[0].length == b.length)
            System.out.println("Матрицы можно умножить друг на друга!");
        else
            System.out.println("Матрицы разных порядков.");

        int result[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int m = 0; m < result.length; m++) {
                    result[i][j] += a[i][m] * b[m][j];
                }
            }
        }
        System.out.println("Матрица result равна: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
