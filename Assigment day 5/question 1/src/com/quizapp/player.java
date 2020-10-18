package com.quizapp;
import java.util.Scanner;
public class player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;
    public void getDetails(){
        System.out.print("Enter your name player : ");
        name=sc.next();
    }
}
