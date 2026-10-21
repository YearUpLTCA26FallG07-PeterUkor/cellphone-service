package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CellPhone firstCellPhone = new CellPhone();

        // prompt and accept input
        System.out.print("What is the serial number? ");
        int serialNumber = input.nextInt();
        firstCellPhone.setSerialNumber(serialNumber);
        input.nextLine();

        System.out.print("What model is the firstCellPhone? ");
        String model = input.nextLine();
        firstCellPhone.setModel(model);


        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();
        firstCellPhone.setCarrier(carrier);

        System.out.print("What is the firstCellPhone number? ");
        String firstCellPhoneNumber = input.nextLine();
        firstCellPhone.setPhoneNumber(firstCellPhoneNumber);

        System.out.print("Who is the owner of the firstCellPhone? ");
        String owner = input.nextLine();
        firstCellPhone.setOwner(owner);

        // display firstCellPhone information
        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + firstCellPhone.getSerialNumber());
        System.out.println("Model: " + firstCellPhone.getModel());
        System.out.println("Carrier: " + firstCellPhone.getCarrier());
        System.out.println("Phone Number: " + firstCellPhone.getPhoneNumber());
        System.out.println("Owner: " + firstCellPhone.getOwner());

    }
}
