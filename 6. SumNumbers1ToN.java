package org.softuni;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++)
            sum = sum + i;

            System.out.println(sum);
        }

        }



