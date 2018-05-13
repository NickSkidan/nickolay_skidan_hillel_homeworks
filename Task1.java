public class Task1 {
    public static void main(String[] args){
        System.out.println("Задано " + args.length + " аргументов командной строки");

        System.out.println();

        for (int i = 0; i < args.length; i++){
            System.out.println("Hello " + args[i] + "!");
        }

        System.out.println();

        String t;
        int a = 0;
        int b = args.length - 1;
        while(a < b) {
            t = args[b];
            args[b] = args[a];
            args[a] = t;
            b--;
            a++;
        }

        System.out.println("Аргументы командной строки в обратном порядке: ");
        for (int c = 0; c < args.length; c++)
            System.out.println(args[c]);

        System.out.println();

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for(int j = 0; j < nums.length; j++)
            System.out.println(nums[j]);

        System.out.println();

        for(int d = 0; d < nums.length; d++)
            System.out.print(nums[d] + " ");

    }
}
