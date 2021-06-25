package encryptdecrypt;

class AlgorithmStore extends AlgorithmFactory {
    @Override
    Algorithm createAlgorithm(String type, String operation, int key, char[] phrase) {
        if ("shift".equals(type)) {
            return new ShiftAlgorithm(operation, key, phrase);
        }
        if ("unicode".equals(type)) {
            return new UnicodeAlgorithm(operation, key, phrase);
        }
        return null;
    }
}