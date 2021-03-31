package com.company;

import java.util.Scanner;

public class ques10 {
    public static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a,b);
        System.out.println("GCD: "+g);
    }
}
