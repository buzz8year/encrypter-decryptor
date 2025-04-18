package encryptdecrypt.cypher;

import encryptdecrypt.Command;
import encryptdecrypt.cypher.impl.CaesarCypher;
import encryptdecrypt.cypher.impl.UnicodeCypher;

public class CypherFactory
{
    private final Command command;
    private Cypher cypher;
    private String result;

    public CypherFactory(Command command)
    {
        this.command = command;
        setCypher();
        run();
    }

    public String getResult() {
        return result;
    }

    private void setCypher()
    {
        if (command.algo.equals("unicode"))
            cypher = new UnicodeCypher();

        else if (command.algo.equals("caesar"))
            cypher = new CaesarCypher();

        // else ...
    }

    private void run()
    {
        cypher.setMode(command.mode.equals("enc"));
        result = cypher.execute(command.data, command.key);
    }

}
