import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CatChar {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Nickolas\\Desktop\\Cat1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Nickolas\\Desktop\\Cat2.txt");
        System.setOut(new PrintStream(fos));
        int i;
        do {
            i = fis.read();
            if ((char) i == 'C') i = 'D';
            if ((char) i == 'A') i = 'O';
            if ((char) i == 'T') i = 'G';
            if (i != -1) fos.write(i);
        } while (i != -1);
    }
}
