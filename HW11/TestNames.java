public class TestNames {
    static <T extends Comparable<T>, V extends T> boolean isArraysEquals(T[] t, V[] v) {
        if (t.length != v.length) return false;
        for (int i = 0; i < t.length; i++) {
            if (t[i] != v[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] names1 = {"Konstantin", "Sergey", "Nick", "Eugen", "Natalya"};
        String[] names2 = {"Igor", "Oleg", "Irina", "Veronica"};
        String[] names3 = {"Konstantin", "Sergey", "Nick", "Eugen", "Natalya"};
        NamesMethod<String> ob1 = new NamesMethod<>(names1);
        NamesMethod<String> ob2 = new NamesMethod<>(names2);
        System.out.println("Идем по массиву names1: ");
        if (ob1.isIncluded("Nick"))
            System.out.println("В массиве имен names1 есть имя Nick");
        else System.out.println("В массиве имен names1 нет имени Nick");
        if (ob1.isIncluded("Olga"))
            System.out.println("В массиве имен names1 есть имя Olga");
        else System.out.println("В массиве имен names1 нет имени Olga");
        System.out.println();
        System.out.println("Теперь идем по массиву names2: ");
        if (ob2.isIncluded("Nick"))
            System.out.println("В массиве имен names1 есть имя Nick");
        else System.out.println("В массиве имен names1 нет имени Nick");
        if (ob2.isIncluded("Olga"))
            System.out.println("В массиве имен names1 есть имя Olga");
        else System.out.println("В массиве имен names1 нет имени Olga");
        System.out.println();
        if (isArraysEquals(names1, names3)) System.out.println("Массивы names1 и names3 одинаковы");
        else System.out.println("Массивы names1 и names3 различаются");
        if (isArraysEquals(names2, names3)) System.out.println("Массивы names2 и names3 одинаковы");
        else System.out.println("Массивы names2 и names3 различаются");
    }
}
