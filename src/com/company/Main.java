package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
	char data[]=scn.next().toCharArray();
    for (int i=0;i<data.length;i++){
        System.out.print(data[i]+"\t");
    }

    }
}
