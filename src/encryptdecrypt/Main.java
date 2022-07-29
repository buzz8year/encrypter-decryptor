package encryptdecrypt;

import encryptdecrypt.cypher.Cypher;
import encryptdecrypt.cypher.CaesarCypher;
import encryptdecrypt.cypher.UnicodeCypher;
import encryptdecrypt.file.FileSaver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Command command = new Command(args);
        command.setParams();

        boolean isEncrypt = "enc".equals(command.mode);
        Cypher cypher;

        if ("unicode".equals(command.algo))
            cypher = new UnicodeCypher(isEncrypt);
        else cypher = new CaesarCypher(isEncrypt);

        String result = cypher.execute(command.data, command.key);

        if (command.out == null) System.out.println(result);
        else FileSaver.write(result, command.out);
    }
}