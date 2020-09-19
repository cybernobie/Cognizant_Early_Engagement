import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("log.txt"));
            int n;
            StringBuilder stringBuilder = new StringBuilder();

            while ((n = fileReader.read()) != -1) {
                stringBuilder.append((char) n);
            }

            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
