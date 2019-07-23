package app.main.file;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderWriter {
    private String str;

    public ReaderWriter(String str) {
        if (str != null)
            this.str = str;
        else
            this.str = "";
    }

    public ReaderWriter() {
        str = "";
    }

    public void setStr(Scanner scan) {
        if (scan.hasNext()) {
            str = scan.nextLine();
        }
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void writeToFileAsText(String path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path), true))) {
            PrintWriter output = new PrintWriter(bufferedWriter);
            output.print(str);
        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }

    }

    public void printTextFromFile(String path) {
        try (FileReader fileReader = new FileReader(new File(path))) {
            BufferedReader reader = new BufferedReader(fileReader);
            String buffer = new String();
            while ((buffer = reader.readLine()) != null) {
                System.out.print(buffer);
            }
        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
