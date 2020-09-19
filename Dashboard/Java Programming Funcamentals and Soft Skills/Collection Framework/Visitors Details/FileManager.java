import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class FileManager {
    public static File createFile() {
        File file = new File("visitors.txt");
        try {
            boolean isFileCreate = file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void writeFile(File file, String record) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(record.concat(";").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileReader fileReader = new FileReader(file);
            int n;

            while ((n = fileReader.read()) != -1) {
                stringBuilder.append((char) n);
            }

            return stringBuilder.toString().split(";");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
