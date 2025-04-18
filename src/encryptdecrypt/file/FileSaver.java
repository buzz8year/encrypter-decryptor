package encryptdecrypt.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void write(String s, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write(s);
        writer.close();
    }
}
