import javax.swing.*;

public class Counter {
    double num1, num2;
    String str1, str2;

    public void Scan() {
        try {
            str1 = JOptionPane.showInputDialog("Введите первое число");
            str2 = JOptionPane.showInputDialog("Введите второе число");
            num1 = Double.parseDouble(str1);
            num2 = Double.parseDouble(str2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Введите число");
        }
    }

    public void Scan(double a, double b) {
        JOptionPane.showMessageDialog(null, "Теперь первое число равно " + a);
        JOptionPane.showMessageDialog(null, "Теперь второе число равно " + b);
    }
}
