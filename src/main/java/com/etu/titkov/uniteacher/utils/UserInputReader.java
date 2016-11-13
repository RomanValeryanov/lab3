package com.etu.titkov.uniteacher.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Simple user input handler. Basically created for
 * a convenience.
 *
 * WARNING - Probably this is not a good practice to
 * create reader on each method request, but this is not
 * critical in context of our work requirements
 *
 * @author Evgenii Ray
 */
public class UserInputReader {

    public static String readLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
