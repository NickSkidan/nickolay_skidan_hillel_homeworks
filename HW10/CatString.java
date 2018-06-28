import java.io.*;

public class CatString {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Nickolas\\Desktop\\Cat1.txt");

        BufferedReader br = new BufferedReader(fr);
        String lineBeforeChange = br.readLine();
        String wholeText = "";
        while (lineBeforeChange != null) {
            wholeText = wholeText.concat(lineBeforeChange);
            lineBeforeChange = br.readLine();
        }
        FileWriter fw = new FileWriter("C:\\Users\\Nickolas\\Desktop\\Cat3.txt");
        String lineAfterFirstChange = wholeText.replaceAll("cat", "dog");
        String lineAfterSecondChange = lineAfterFirstChange.replaceAll("Cat", "Dog");
        fw.write(lineAfterSecondChange);
        fw.close();
        fr.close();
        br.close();
    }
}
