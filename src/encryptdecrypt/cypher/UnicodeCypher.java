package encryptdecrypt.cypher;

public class UnicodeCypher implements Cypher {
    boolean isEncrypt;

    public UnicodeCypher(boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public String execute(String s, int key) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int pos = isEncrypt ? (int)c + key : (int)c - key;
            sb.append((char)pos);
        }
        return sb.toString();
    }
}

