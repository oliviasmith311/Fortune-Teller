package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        //Ask for first name
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();

        //Ask for last name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        //Ask for age
        System.out.println("What is your age?");
        int age = input.nextInt();

        //Ask for birth month
        System.out.println("What is your birth month?");
        int birthMonth = input.nextInt();

        input.nextLine();
        //Ask for favorite color
        System.out.println("What is your favorite color (Enter a ROYGBIV color or ask for HELP)?");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("help")) {
            System.out.println("Use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, or VIOLET");
        }
        System.out.println("What is your favorite color?");
        favoriteColor = input.nextLine();

        //Ask for number of siblings
        System.out.println("How many siblings do you have?");
        int numberSiblings = input.nextInt();

        //PART 2
        //Determine years until retirement

        int numberOfYearsUntilRetirement = 0;

        if (age % 2 == 0) {
            numberOfYearsUntilRetirement = 24;
        } else {
            numberOfYearsUntilRetirement = 17;
        }

        String vacationHomeLocation = "";
        if (numberSiblings == 0) {
            vacationHomeLocation = "Boca Raton";
        } else if (numberSiblings == 1) {
            vacationHomeLocation = "Nassau";
        } else if (numberSiblings == 2) {
            vacationHomeLocation = "Ponta Negra";
        } else if (numberSiblings == 3) {
            vacationHomeLocation = "Portland";
        } else if (numberSiblings > 3) {
            vacationHomeLocation = "Baton Rouge";
        } else {
            vacationHomeLocation = "Chernobyl";
        }

        String modeOfTransportation = "";

        switch (favoriteColor.toUpperCase()){
            case "RED":
                modeOfTransportation ="Maserati";
                break;
            case "ORANGE":
                modeOfTransportation ="Stallion";
                break;
            case "YELLOW":
                modeOfTransportation ="Chariot";
                break;
            case "GREEN":
                modeOfTransportation ="Taxi";
                break;
            case "BLUE":
                modeOfTransportation ="Rickshaw";
                break;
            case "INDIGO":
                modeOfTransportation ="Motor Scooter";
                break;
            case "VIOLET":
                modeOfTransportation ="Flying Saucer";
                break;
            default:
                modeOfTransportation ="Learn your colors dumbass";
        }

        double bankBalance = 0.0;

        if (birthMonth>=1 && birthMonth <=4){
            bankBalance = 5000000.02;
        }else if (birthMonth >=5 && birthMonth <=8){
            bankBalance = 250000.45;
        }else if (birthMonth >=9 && birthMonth <= 12){
            bankBalance = 1000000000.69;
        }else {
            bankBalance = -420000.34;
        }

        System.out.println(firstName +" "+ lastName +" will retire in "+ numberOfYearsUntilRetirement + " years \n"+
                "with " + bankBalance + " in the bank, a vacation home in " + vacationHomeLocation + ", and will travel by \n"
                + modeOfTransportation + ".");
     }
}
