package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner scanner = new Scanner(System.in);


    public static void main( String[] args )
    {
        String name;
        System.out.print(" enter your name :   ");

        name = scanner.nextLine();

        System.out.println( " */* " + name );
    }
}
