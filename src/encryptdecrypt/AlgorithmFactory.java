package encryptdecrypt;

abstract class AlgorithmFactory {
    abstract Algorithm createAlgorithm(String type, String operation, int key, char[] phrase);

    Algorithm orderAlgorithm(String type, String operation, int key, char[] phrase) {
        Algorithm algorithm = createAlgorithm(type, operation, key, phrase);

        return algorithm;
    }
}