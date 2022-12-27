package org.example;

import org.example.CustomExceptionHandler.CustomExeption;
import org.example.Programs.JavaProgrammingConstruct.SwitchProgrammingConstruct;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, CustomExeption.InvalidString, CustomExeption.EmptyString {

        /*//Instantiating the File class
        File file = new File("C:\\kunal_kushwaha_DSA\\Project\\readme.txt");
        //Instantiating the PrintStream class
        PrintStream stream = new PrintStream(file);
        System.out.println("From now on "+file.getAbsolutePath()+" will be your console");
        System.setOut(stream);
        //Printing values to file*/
        System.out.println("isNumberArmstrong:" + JavaIOOpration.isNumberArmstrong(111));
        System.out.println("isNumberPalindrome:" + JavaIOOpration.isNumberPalindrome(2233));
        System.out.println("Employee Salary:" + JavaIOOpration.calCulateSal(344));
        System.out.println("isPrimeNumber:" + JavaIOOpration.isPrimeNumber(4151));
        System.out.println("LargestNumber:" + JavaIOOpration.getLargestNumber(23, 56, 89));
        JavaIOOpration.checkCase("habhahUYGUIYTUITUIa");
        System.out.println("FibonacciSeriesNthNumber"+JavaIOOpration.getNthFibonacciNumber(7));
        System.out.println("Frequency of Number:"+JavaIOOpration.frequencyCounter(326273333398888833L));
        JavaIOOpration.longestPrefix();
        SwitchProgrammingConstruct.nestedSwitchCase();
    }
}

