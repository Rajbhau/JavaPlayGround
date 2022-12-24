package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Instantiating the File class
        File file = new File("C:\\kunal_kushwaha_DSA\\Project\\readme.txt");
        //Instantiating the PrintStream class
        PrintStream stream = new PrintStream(file);
        System.out.println("From now on "+file.getAbsolutePath()+" will be your console");
        System.setOut(stream);
        //Printing values to file
        System.out.println("isNumberArmstrong:"+Mathematics.isNumberArmstrong(111));
        System.out.println("isNumberPalindrome:"+Mathematics.isNumberPalindrome(2233));
        System.out.println("Employee Salary:"+Mathematics.calCulateSal(344));
        System.out.println("isPrimeNumber:"+Mathematics.isPrimeNumber(4151));
    }

}