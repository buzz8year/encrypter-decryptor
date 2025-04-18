package encryptdecrypt.cypher;

public abstract class AbstractCypher
{
    public boolean modeEnc = true;

    public void setMode(boolean modeEnc)
    {
        this.modeEnc = modeEnc;
    }

    public String encrypt(String s, int key)
    {
        setMode(true);
        return execute(s, key);
    }

    public String decrypt(String s, int key)
    {
        setMode(false);
        return execute(s, key);
    }

    public abstract String execute(String s, int key);
}
