package encryptdecrypt;

// Factory OutPut
abstract class OutPutFactory {
    abstract OutPut createOutPut(char[] phrase, String outputPath);

    OutPut orderOutPut(char[] phrase, String outputPath) {
        OutPut outPut = createOutPut(phrase, outputPath);

        return outPut;
    }
}