package org.example;


import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    private static String password = "poopman5080$"; //password
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String pass, user;
        System.out.print("What is your username?" );
        user = scan.nextLine();
        System.out.print("What is the password? ");
        pass = scan.nextLine();
        if (pass.compareTo(password) == 0){ //if theyre the same, say welcome
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you");
        }

    }
}
