package encryptdecrypt;

class UnicodeAlgorithm extends Algorithm {
    public UnicodeAlgorithm(String operation, int key, char[] phrase) {
        super(operation, key, phrase);
    }

    public void decryption() {
        key = -1 * key;
        encryption();
    }

    public void encryption() {
        for (int i = 0; i < phrase.length; i++) {
            phrase[i] += key;
        }
    }
}