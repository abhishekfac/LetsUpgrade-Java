package com.sum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] a =new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.print("Enter a Number : ");
            a[i]= sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("The sum of entered numbers is : "+sum);
    }
}
