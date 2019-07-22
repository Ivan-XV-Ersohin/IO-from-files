package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderWriter {
    private String str;

    public ReaderWriter(String str) {
        this.str = str;
    }

    public ReaderWriter() {

    }

    public void setStr(Scanner scan) {
        if (scan.hasNext()) {
            str = scan.nextLine();
        }
    }

    public String getStr() {
        return str;
    }

    public void writeToFileAsText(String path) {
        try (FileWriter output = new FileWriter(path)) {
            output.write(str);
            output.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }

    }

    public void printTextFromFile(String path) {
        try (FileReader inp = new FileReader(path)) {
            int symbol;
            while ((symbol = inp.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }
    }
}
