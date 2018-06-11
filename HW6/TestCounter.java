import javax.swing.*;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.Scan();
        counter.num1 = count(counter.num1);
        counter.num2 = count(counter.num2);
        counter.Scan(counter.num1, counter.num2);
    }

    private static double count(double num) {
        num = 1000 / num;
        return num;
    }
}
