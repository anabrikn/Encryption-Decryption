package encryptdecrypt;

class OutPutStore extends OutPutFactory {
    @Override
    OutPut createOutPut(char[] phrase, String outputPath) {
        if ("".equals(outputPath)) {
            return new OutInStandardOut(phrase, outputPath);
        } else {
            return new OutInFile(phrase, outputPath);
        }
    }
}