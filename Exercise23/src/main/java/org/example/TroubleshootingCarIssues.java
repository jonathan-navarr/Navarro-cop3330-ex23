package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */

public class TroubleshootingCarIssues {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String response;

        System.out.print("Is the car silent when you turn the key? ");
        response = scnr.next();
        if(response.equals("yes") || response.equals("y")){
            System.out.print("Are the batter terminals corroded? ");
            response = scnr.next();
            if(response.equals("yes") || response.equals("y")){
                System.out.print("Clean the terminals and try starting again.");
            }
            else if(response.equals("no") || response.equals("n")){
                System.out.print("Replace cables and try again");
            }
        }
        else if(response.equals("no") || response.equals("n")){
            System.out.print("Does the car make a slicking noise? ");
            response = scnr.next();

            if(response.equals("yes") || response.equals("y")) {
                System.out.print("Replace the battery");
            }
            else if(response.equals("no") || response.equals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                response = scnr.next();
                if(response.equals("yes") || response.equals("y")){
                    System.out.print("Check the spark plug connections");
                }
                else if(response.equals("no") || response.equals("n")){
                    System.out.print("Does the engine start and then die? ");
                    response = scnr.next();
                    if(response.equals("yes") || response.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        response = scnr.next();

                        if(response.equals("yes") || response.equals("y")) {
                            System.out.print("Get it in for service");
                        }
                        else if(response.equals("no") || response.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing");
                        }

                    }
                    else if(response.equals("no") || response.equals("n")){
                        System.out.print("This should not be possible");
                    }

                }

            }
            }

        }

    }
