package com.employee;

public class Main {

    public static void main(String[] args) {
        doctor[] d = new doctor[2];
        System.out.println("\nDoctor's Section\n");
        for (int i=0;i<2;i++)
        {
            d[i]=new doctor();
            d[i].getDetails();
        }
        for (int i=0;i<2;i++)
        {
            System.out.print(i+1);
            System.out.print(". ");
            d[i].displayDetails();
        }
        engineer[] e =new engineer[2];
        System.out.println("\nEngineer's Section\n");
        for (int i=0;i<2;i++)
        {
            e[i]=new engineer();
            e[i].getDetails();
        }
        for (int i=0;i<2;i++)
        {
            System.out.print(i+1);
            System.out.print(". ");
            e[i].displayDetails();
        }
        pilot[] p =new pilot[2];
        System.out.println("\nPilot's Section\n");
        for (int i=0;i<2;i++)
        {
            p[i]=new pilot();
            p[i].getDetails();
        }
        for (int i=0;i<2;i++)
        {
            System.out.print(i+1);
            System.out.print(". ");
            p[i].displayDetails();
        }
    }
}
