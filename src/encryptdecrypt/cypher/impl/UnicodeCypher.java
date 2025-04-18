package encryptdecrypt.cypher.impl;

import encryptdecrypt.cypher.AbstractCypher;
import encryptdecrypt.cypher.Cypher;

public class UnicodeCypher extends AbstractCypher implements Cypher
{
    public UnicodeCypher() {
    }

    public UnicodeCypher(boolean modeEnc) {
        super.setMode(modeEnc);
    }

    public String execute(String s, int key)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
        {
            int pos = modeEnc
                    ? (int)c + key
                    : (int)c - key;

            sb.append((char)pos);
        }
        return sb.toString();
    }
}

