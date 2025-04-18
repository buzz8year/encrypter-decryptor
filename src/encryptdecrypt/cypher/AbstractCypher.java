package encryptdecrypt.cypher;

public abstract class AbstractCypher
{
    protected boolean modeEnc = true;

    protected void setMode(boolean modeEnc)
    {
        this.modeEnc = modeEnc;
    }

    protected String encrypt(String s, int key)
    {
        setMode(true);
        return execute(s, key);
    }

    protected String decrypt(String s, int key)
    {
        setMode(false);
        return execute(s, key);
    }

    protected abstract String execute(String s, int key);
}
