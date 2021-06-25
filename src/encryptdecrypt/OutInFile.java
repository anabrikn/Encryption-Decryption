package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class OutInFile extends OutPut {
    public OutInFile(char[] phrase, String outputPath) {
        super(phrase, outputPath);
    }

    @Override
    void out() {
        File file = new File(outputPath);
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < phrase.length; i++) {
                writer.write(phrase[i]);
            }
        } catch (IOException e) {
            System.out.printf("Error. An exception occurs %s", e.getMessage());
        }
    }
}