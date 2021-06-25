package encryptdecrypt;

class OutInStandardOut extends OutPut {
    public OutInStandardOut(char[] phrase, String outputPath) {
        super(phrase, outputPath);
    }

    @Override
    void out() {
        for (char s : phrase) {
            System.out.print(s);
        }
    }
}