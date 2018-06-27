import java.io.*;

public class CatString {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Nickolas\\Desktop\\Cat1.txt");
        FileWriter fw = new FileWriter("C:\\Users\\Nickolas\\Desktop\\Cat3.txt");
        BufferedReader br = new BufferedReader(fr);
        String lineBeforeChange = br.readLine();
        String lineAfterChange = lineBeforeChange.replaceAll("CAT", "DOG");
        do {
            if (lineAfterChange != null) fw.write(lineAfterChange);
            lineAfterChange = br.readLine();
        } while (lineAfterChange != null);
        fw.close();
        fr.close();
    }
}
