package org.softuni;

public class GhettoNumeralSystem {
    public static void ghettoNumeralSystem(String input) {
        char[] chars = new char[input.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '0': sb.append("Gee"); break;
                case '1': sb.append("Bro"); break;
                case '2': sb.append("Zuz"); break;
                case '3': sb.append("Ma"); break;
                case '4': sb.append("Duh"); break;
                case '5': sb.append("Yo"); break;
                case '6': sb.append("Dis"); break;
                case '7': sb.append("Hood"); break;
                case '8': sb.append("Jam"); break;
                case '9': sb.append("Mack"); break;
                default: break;
            }
        }

        String output = sb.toString();
        System.out.println(output);
    }
}