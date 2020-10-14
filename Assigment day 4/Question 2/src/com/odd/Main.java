package com.odd;

public class Main {

    public static void main(String[] args) {
	int[] num=new int[]{ 1,2,3,4,5 };
	int i;
	for(i = 0; i < num.length; i++) {
	    if(num[i]%2==1)
	        System.out.println(num[i]);
    }
    }
}
