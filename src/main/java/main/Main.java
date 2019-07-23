package main;

import app.main.file.Checker;
import app.main.file.ReaderWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReaderWriter readerWriter = new ReaderWriter();
        Checker checker = new Checker() {
            @Override
            public boolean isEnteredWordExit(String str) {
                if (str.equals("exit"))
                    return true;
                else
                    return false;
            }
        };
        while (scanner.hasNext()) {
            readerWriter.setStr(scanner.nextLine());
            if (!checker.isEnteredWordExit(readerWriter.getStr())) {
                readerWriter.writeToFileAsText("D:\\Projects\\fileInputOutput\\Files\\file.txt");
                readerWriter.printTextFromFile("D:\\Projects\\fileInputOutput\\Files\\file.txt");
            } else
                break;
            //  System.exit(0); - грубо, но как вариант можно
        }
        scanner.close();
    }
}
