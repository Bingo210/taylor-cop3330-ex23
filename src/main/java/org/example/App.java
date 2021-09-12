/*
 * UCF COP3330 Fall 2021 Assignment 23 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the car troubleshooter. Answer with a y/n.\n");

        System.out.println("Is the car silent when you turn the key?");
        String silent = input.next();
        if (silent.equals("y")) {
            System.out.println("Are the battery terminals corroded?");
            String corrTerm = input.next();
            if (corrTerm.equals("y"))
                System.out.println("Clean terminals and try starting again.");
            else if (corrTerm.equals("n"))
                System.out.println("Replace cables and try again.");
        }
        else if (silent.equals("n")){
            System.out.println("Does the car make a clicking noise?");
            String clicking = input.next();
            if (clicking.equals("y"))
                System.out.println("Replace the battery.");
            else if (clicking.equals("n")) {
                System.out.println("Does the car crank up but fail to start?");
                String crank = input.next();
                if (crank.equals("y"))
                    System.out.println("Check spark plug connections.");
                else if (crank.equals("n")) {
                    System.out.println("Does the engine start and then die?");
                    String die = input.next();
                    if (die.equals("y")) {
                        System.out.println("Does you car have fuel injection?");
                        String fuelInj = input.next();
                        if (fuelInj.equals("y"))
                            System.out.println("Get it in for service.");
                        else if (fuelInj.equals("n"))
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else if (die.equals("n"))
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}
