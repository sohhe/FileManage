package com.company;


import java.util.Scanner;

public class ScannerWrapper {
    private Scanner scanner = new Scanner(System.in);

    public String readLine(){
        return scanner.nextLine();
    }

    public int readInt(){
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public double readDouble(){
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }
}
