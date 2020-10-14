package com.avenger;

public class Main {

    public static void main(String[] args) {
        avenger[] hero=new avenger[5];
        for (int i=0;i<5;i++)
        {
            hero[i]=new avenger();
            hero[i].getDetails();
        }
        for (int i=0;i<5;i++)
        {
            System.out.print(i+1);
            System.out.print(". ");
            hero[i].displayDetails();
        }
    }
}
