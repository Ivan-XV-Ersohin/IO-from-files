package main;

import file.ReaderWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReaderWriter rw = new ReaderWriter();
        rw.setStr(sc);
        sc.close();
        rw.writeToFileAsText("D:\\Projects\\fileInputOutput\\Files\\file.txt");
        rw.printTextFromFile("D:\\Projects\\fileInputOutput\\Files\\file.txt");
    }
}
