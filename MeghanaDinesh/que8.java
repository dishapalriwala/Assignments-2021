package com.practice;
import java.sql.SQLOutput;
import java.util.Scanner;
public class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        boolean valid=false;
        if(year%4==0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    valid = true;
                else
                    valid = false;
            }
            else
                valid = true;
        }
        else
            valid=false;
        if(valid==true)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}
