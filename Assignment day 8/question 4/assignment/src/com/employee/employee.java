package com.employee;
import java.util.Scanner;

public class

employee {
    public String name;
    public int age;
    public double salary;
    public String designation;
    Scanner sc=new Scanner(System.in);
    void getDetails(){
        System.out.print("Enter name of employee :");
        name= sc.next();
        System.out.print("Enter age of employee :");
        age= sc.nextInt();
        System.out.print("Enter salary of employee :");
        salary= sc.nextDouble();
        System.out.print("Enter designation of employee :");
        designation= sc.next();
    }
    void displayDetails(){
        System.out.println("The name of employee is "+name+", his age is "+age+", his salary is "+salary+", and his designation is "+designation+".");
    }

}
