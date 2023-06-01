package com.win.junit;


import java.util.Scanner;
public class ScannerAssign {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String firstInput = scanner2.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String secondInput = scanner2.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
        scanner2.close();
    }
}
