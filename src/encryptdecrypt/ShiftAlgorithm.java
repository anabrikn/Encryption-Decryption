package encryptdecrypt;

class ShiftAlgorithm extends Algorithm {
    public ShiftAlgorithm(String operation, int key, char[] phrase) {
        super(operation, key, phrase);
    }

    @Override
    void decryption() {
        key = -1 * key;
        encryption();
    }

    @Override
    void encryption() {
        int alphabetSize = 26;
        key %= alphabetSize;

        for (int i = 0; i < phrase.length; i++) {
            int currentChar = phrase[i];
            int shiftedChar = currentChar + key;

            int firstChar;
            int lastChar;
            if (currentChar >= 'a' && currentChar <= 'z') {
                firstChar = 'a';
                lastChar = 'z';
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                firstChar = 'A';
                lastChar = 'Z';
            } else {
                phrase[i] = (char) currentChar;
                continue;
            }

            if (shiftedChar > lastChar) {
                shiftedChar -= alphabetSize;
            } else if(shiftedChar < firstChar) {
                shiftedChar += alphabetSize;
            }

            phrase[i] = (char) shiftedChar;
        }
    }
}