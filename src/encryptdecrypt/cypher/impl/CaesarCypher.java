package encryptdecrypt.cypher.impl;

import encryptdecrypt.cypher.AbstractCypher;
import encryptdecrypt.cypher.Cypher;

public class CaesarCypher extends AbstractCypher implements Cypher
{
    private String template;

    public void setMode(boolean modeEnc)
    {
        super.setMode(modeEnc);
        template = modeEnc
                ? "abcdefghijklmnopqrstuvwxyz"
                : "zyxwvutsrqponmlkjihgfedcba";
    }

    public String execute(String s, int key)
    {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray())
        {
            if (Character.isLetter(c))
            {
                boolean isUpper = false;

                if (Character.isUpperCase(c))
                {
                    c = Character.toLowerCase(c);
                    isUpper = true;
                }
                int pos = template.indexOf(c) + key;
                if (pos > 26)
                    pos -= 26;

                char x = template.charAt(pos);
                if (isUpper)
                    x = Character.toUpperCase(x);
                sb.append(x);
            }
            else sb.append(c);
        }

        return sb.toString();
    }


}
