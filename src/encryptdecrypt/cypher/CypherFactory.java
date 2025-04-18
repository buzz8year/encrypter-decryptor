package encryptdecrypt.cypher;

import encryptdecrypt.Command;
import encryptdecrypt.cypher.impl.CaesarCypher;
import encryptdecrypt.cypher.impl.UnicodeCypher;

public class CypherFactory
{
    private Command command;
    private Cypher cypher;
    private String result;
    private boolean modeEnc;

    public CypherFactory() {
    }

    public CypherFactory(Command command)
    {
        this.command = command;
        this.modeEnc = "enc".equals(command.mode);
        setCypher();
        run();
    }

    private void setCypher()
    {
        if ("unicode".equals(command.algo))
            this.cypher = new UnicodeCypher(modeEnc);
        else this.cypher = new CaesarCypher(modeEnc);
    }

    public void run()
    {
        this.result = cypher.execute(command.data, command.key);
    }

    public String getResult()
    {
        return this.result;
    }
}
