public class AutoBox {
    static void number(Long l) {
        System.out.println("В number() мы задали " + l);
    }

    static Long number1() {
        return 100_000_000_000;
    }

    static long number2() {
        return 233566879087;
    }

    public static void main(String[] args) {
        number(10_000_000_000);
        long l1 = number1();
        System.out.println("Значение, которое мы распаковываем из метода number1(): " + l1);
        Long l2 = number2();
        switch (l2) {
            case 233566879087:
                System.out.println("Это наше число");
                break;
            case 233678566879087:
                System.out.println("Не наше число");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
