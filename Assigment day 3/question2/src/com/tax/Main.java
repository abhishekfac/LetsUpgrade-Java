package com.tax;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double tax=0,mincome,yincome;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of  Employee in BLOCK LETTERS : ");
        name= sc.next();
        System.out.print("Enter day of birth : ");
        int day= sc.nextInt();
        System.out.print("Enter month of birth : ");
        int month= sc.nextInt();
        System.out.print("Enter year of birth : ");
        int year= sc.nextInt();
        Date cd=new Date();
        int cyear=cd.getYear();
        int cdyear=cyear+1900;
        int age=cdyear-year;
        System.out.print("Enter monthly income : ");
        mincome=sc.nextDouble();
        yincome=mincome*12;
        if(yincome<=200000)
            tax=5*(yincome/100);
        else if(yincome<=300000)
            tax=10*(yincome/100);
        else if(yincome<=400000)
            tax=15*(yincome/100);
        else if(yincome<=500000)
            tax=20*(yincome/100);
        else
            System.out.println("Enter right values........!");
        System.out.println("The name of Employee is "+name);
        System.out.println("His age is "+age);
        System.out.println("His total salary is "+yincome);
        System.out.println("His annual income tax amount is "+tax);
    }
}
