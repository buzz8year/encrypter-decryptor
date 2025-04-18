package encryptdecrypt;

import encryptdecrypt.cypher.CypherFactory;
import encryptdecrypt.file.FileSaver;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Command command = new Command(args);

        CypherFactory factory = new CypherFactory(command);
        String result = factory.getResult();

        if (command.out == null) System.out.println(result);
        else FileSaver.write(result, command.out);
    }
}