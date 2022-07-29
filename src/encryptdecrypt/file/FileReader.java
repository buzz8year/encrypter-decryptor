package encryptdecrypt.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static String read(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine())
            sb.append(scanner.nextLine().trim());
        scanner.close();

        return sb.toString();
    }
}
