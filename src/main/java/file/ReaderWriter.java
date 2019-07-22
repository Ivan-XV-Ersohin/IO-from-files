package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderWriter {
    private String str;

    public ReaderWriter(String str) {
        this.str = str;
    }

    public ReaderWriter (){

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
        FileWriter output = null;
        try {
            output = new FileWriter(path);
            output.write(str);
            output.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        }
    }

    public void printTextFromFile(String path) {
        FileReader inp = null;
        try {
            inp = new FileReader(path);
            try {
                int symbol;
                while ((symbol = inp.read()) != -1) {
                    System.out.println((char) symbol);
                }
            } catch (IOException ex) {
                System.err.println(ex);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (inp != null) {
                try {
                    inp.close();
                } catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        }
    }
}
