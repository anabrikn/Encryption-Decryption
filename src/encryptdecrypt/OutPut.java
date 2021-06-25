package encryptdecrypt;

abstract class OutPut {
    char[] phrase;
    String outputPath;

    public OutPut(char[] phrase, String outputPath) {
        this.phrase = phrase;
        this.outputPath = outputPath;
    }

    abstract void out();
}