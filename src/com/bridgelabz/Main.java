package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first name ");
        Scanner myinput = new Scanner(System.in);
        String f = myinput.nextLine();
        Contacts myobject = new Contacts();
        myobject.setfirstname(f);
        String print = myobject.getfirstname();
        System.out.println(" Entered input is   " + print);
        //******************************************************//
        System.out.println("Enter Last name ");
        String l = myinput.nextLine();
        myobject.setlastname(l);
        myobject.getlastname();
    }
}
