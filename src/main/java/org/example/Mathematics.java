package org.example;

import org.example.Constant.StringConstants;
import org.example.CustomExceptionHandler.CustomExeption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mathematics {
    public static boolean isNumberArmstrong(int num){
        int rem=0,sum=0,temp;
        temp=num;
        while(num>0){
           rem= num%10;
            sum+=rem*rem*rem;
            num=num/10;
        }
        if (temp==sum)
            return true;
            else
            return false;
    }
    public static boolean isNumberPalindrome(int num){
        int rem=0,reverse=0,temp;
        temp=num;
        while(num>0){
            rem= num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if (temp==reverse)
            return true;
        else
            return false;
    }
    public static int calCulateSal(int salary){
        if (salary>10000)
           return salary=salary+2000;
        else
          return  salary=salary+1000;
    }
    public static boolean isPrimeNumber(int num){
        int count=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if( num%i==0)
            {
                count++;
                break;
            }
        }
        if (count==0)
            return true;
        else
            return false;
    }
    public static int getLargestNumber(int x,int y,int z){
       int max=x;
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        return max;

    }

    public static void  TypeCheckOfCharacter(String string) throws CustomExeption.InvalidString, CustomExeption.EmptyString{
        // 97 to 122 lower
        //65 to 90 upper case
        String strSource = string;

        String strPattern = "[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strSource);
        if(strSource.isEmpty()){
            throw new CustomExeption.EmptyString("Empty String Found,Please enter valid String");
        }

        if(m.find()) {
            throw new CustomExeption.InvalidString("String contains special character(s)");
        }
            char[] chars = string.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>=97 && chars[i]<=122)
                 System.out.println(StringConstants.CHARACTER_LOWERCASE+":"+chars[i]);
            else
                System.out.println(StringConstants.CHARACTER_UPPERCASE+":"+chars[i]);
        }


    }
}
