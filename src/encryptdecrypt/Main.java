package encryptdecrypt;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

// The program should not modify non-letter characters.
public class Main {
    static String str = "";
    static String inputPath = "";
    static String operation = "enc";
    static int key = 0;
    static String outputPath = "";
    static String algorithm = "shift";

    public static void processingArgs(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-data") && !args[i + 1].startsWith("-")) {
                str = args[i + 1];
            }
            if (args[i].equals("-in") && !args[i + 1].startsWith("-")) {
                inputPath = args[i + 1];
            }

            if (args[i].equals("-mode") && !args[i + 1].startsWith("-")) {
                operation = args[i + 1];
            }
            if (args[i].equals("-key") && !args[i + 1].startsWith("-")) {
                key = Integer.parseInt(args[i + 1]);
            }

            if (args[i].equals("-out") && !args[i + 1].startsWith("-")) {
                outputPath = args[i + 1];
            }

            if (args[i].equals("-alg") && !args[i + 1].startsWith("-")) {
                algorithm = args[i + 1];
            }

        }
    }

    public static void main(String[] args) {
        processingArgs(args);

        char[] arr = inPut(str, inputPath);

        AlgorithmStore store = new AlgorithmStore();
        Algorithm actualAlgorithm = store.orderAlgorithm(algorithm, operation, key, arr);
        char[] string = actualAlgorithm.processing();

        OutPutStore outPutStore = new OutPutStore();
        OutPut outPut = outPutStore.orderOutPut(string, outputPath);
        outPut.out();
    }

    public static char[] inPut(String str, String pathToFile) {
        char[] result = new char[0];
        if (str.equals("") && pathToFile.equals("")) {
            return new char[0];
        }

        if (!str.equals("")) {
            return str.toCharArray();
        }

        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            String s = scanner.nextLine();
            result = s.toCharArray();
        } catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("Error. No file found: " + pathToFile + " " + e.getMessage());
        }
        return result;
    }

}
