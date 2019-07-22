package main;

import file.ReaderWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReaderWriter readerWriter = new ReaderWriter();
        readerWriter.setStr(scanner);
        scanner.close();
        readerWriter.writeToFileAsText("D:\\Projects\\fileInputOutput\\Files\\file.txt");
        readerWriter.printTextFromFile("D:\\Projects\\fileInputOutput\\Files\\file.txt");
    }
}
