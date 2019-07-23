package main;

import file.Checker;
import file.ReaderWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReaderWriter readerWriter = new ReaderWriter();
        Checker checker = new Checker() {
            public boolean isEnteredWordExit(String str) {
                if (str.equals("exit"))
                    return true;
                else
                    return false;
            }
        };
        do {
            readerWriter.setStr(scanner.nextLine());
            readerWriter.writeToFileAsText("D:\\Projects\\fileInputOutput\\Files\\file.txt");
            readerWriter.printTextFromFile("D:\\Projects\\fileInputOutput\\Files\\file.txt");
            readerWriter.setStr(scanner.nextLine());
        } while (!checker.isEnteredWordExit(readerWriter.getStr()));
        scanner.close();
    }
}
