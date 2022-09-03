package main;

import java.io.*;

public class RandomDataFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("./random-data.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        RandomFrequencyBuilder rand = new RandomFrequencyBuilder();
        for (int i = 0; i <= 50; i++) {
            printWriter.println(rand);
        }
        printWriter.close();
    }
}
