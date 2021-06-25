package encryptdecrypt;

abstract class Algorithm {
    String operation;
    int key;
    char[] phrase;

    public Algorithm(String operation, int key, char[] phrase) {
        this.operation = operation;
        this.key = key;
        this.phrase = phrase;
    }

    abstract void decryption();
    abstract void encryption();

    public char[] processing() {
        switch (this.operation) {
            case "enc":
                this.encryption();
                break;
            case "dec":
                this.decryption();
                break;
        }
        return phrase;
    }
}