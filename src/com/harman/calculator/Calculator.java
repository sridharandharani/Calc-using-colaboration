package com.harman.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Addition addobj = new Addition();
        Subtraction subobj=new Subtraction();
        Multiplication mulobj=new Multiplication();
        Division divobj = new Division();

        Scanner input = new Scanner(System.in);
        int x , y;

        System.out.println("Enter the number 1 :");
        x = input.nextInt();

        System.out.println("Enter the number 2 :");
        y = input.nextInt();

        int addresult = addobj.add2numbers(x,y);
        System.out.println(addresult);

        int subresult=subobj.sub2numbers(x,y);
        System.out.println(subresult);

        int mulresult=mulobj.mul2numbers(x,y);
        System.out.println(mulresult);

        int divresult = divobj.div_two_numbers(x,y);
        System.out.println(divresult);
    }

}
