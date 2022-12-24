package org.example;

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
}
