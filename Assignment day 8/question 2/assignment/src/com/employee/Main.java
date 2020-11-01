package com.employee;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doctor d =new doctor();
        engineer e =new engineer();
        pilot p =new pilot();
        d.getDetails();
        d.displayDetails();
        d.treats();
        e.getDetails();
        e.displayDetails();
        e.build();
        p.getDetails();
        p.displayDetails();
        p.flies();
    }
}
