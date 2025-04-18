package encryptdecrypt.cypher;

public interface Cypher
{
    void setMode(boolean modeEnc);
    String execute(String s, int key);
}
