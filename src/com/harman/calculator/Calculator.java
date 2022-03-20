package com.harman.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj = new Addition();
        Subtraction subobj=new Subtraction();
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


    }

}
