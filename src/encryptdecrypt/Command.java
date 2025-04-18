package encryptdecrypt;

import encryptdecrypt.file.FileReader;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Command
{
    private final String[] args;

    public int key = 0;
    public String algo = "unicode";
    public String mode = "enc";
    public String in = null;
    public String out = null;
    public String data = null;

    public Command(String[] args) throws FileNotFoundException
    {
        this.args = args;
        this.setParams();
    }

    public void setParams() throws FileNotFoundException
    {
        this.setAlgorithm();
        this.setMode();
        this.setKey();
        this.setIn();
        this.setOut();
        this.setData();
    }

    private void setAlgorithm() {
        int i = Arrays.asList(args).indexOf("-alg");
        if (i >= 0) algo = args[i + 1];
    }

    private void setMode() {
        int i = Arrays.asList(args).indexOf("-mode");
        if (i >= 0) mode = args[i + 1];
    }

    private void setKey() {
        int i = Arrays.asList(args).indexOf("-key");
        if (i >= 0) key = Integer.parseInt(args[i + 1]);
    }

    private void setIn() {
        int i = Arrays.asList(args).indexOf("-in");
        if (i >= 0) in = args[i + 1];
    }

    private void setOut() {
        int i = Arrays.asList(args).indexOf("-out");
        if (i >= 0) out = args[i + 1];
    }

    private void setData() throws FileNotFoundException
    {
        int i = Arrays.asList(args).indexOf("-data");

        if (i >= 0)
            data = args[i + 1];
        else if (in == null)
            data = "";
        else data = FileReader.read(in);
    }
}
