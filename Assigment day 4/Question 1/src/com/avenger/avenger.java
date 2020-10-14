package com.avenger;
import java.util.Scanner;
public class avenger {
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;
    Scanner sc=new Scanner(System.in);
    void getDetails(){
        System.out.print("Enter name of Avenger :");
        name= sc.next();
        System.out.print("Enter age of Avenger :");
        age= sc.nextInt();
        System.out.print("Enter power of Avenger :");
        power= sc.next();
        System.out.print("Enter weapon of Avenger :");
        weapon= sc.next();
        System.out.print("Enter planet of Avenger :");
        planet=sc.next();
    }
    void displayDetails(){
        System.out.println("The name of Avenger is "+name+", his age is "+age+", his power is "+power+", his weapon is "+weapon+" and his planet is "+planet+".");
    }

}
