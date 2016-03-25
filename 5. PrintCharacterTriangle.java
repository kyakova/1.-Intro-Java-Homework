package org.softuni;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int input = console.nextInt();
        PrintCharacterTriangle.printCharacterTriangle(input);
    }

    public class PrintCharacterTriangle {
        public static void printCharacterTriangle(int num) {
            int counter = 1;
            char currentChar = 'a';

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < counter; j++) {
                    System.out.printf("%c ", currentChar);
                    currentChar++;
                }
                System.out.println();
                currentChar = 'a';
                counter += 1;
            }

            counter -= 1;

            for (int i = 0; i < num - 1; i++) {
                counter -= 1;
                for (int j = 0; j < counter; j++) {
                    System.out.printf("%c ", currentChar);
                    currentChar++;
                }
                System.out.println();
                currentChar = 'a';
            }
        }
    }
}
