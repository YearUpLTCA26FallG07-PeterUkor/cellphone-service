package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(123456, "Samsung", "AT&T", "123-456-7890", "Peter");

        // prompt and accept input
        configCellPhone(cellPhone1, input);
        // create a new cell phone
        configCellPhone(cellPhone2, input);

        cellPhone1.displayCellPhoneInfo();
        cellPhone2.displayCellPhoneInfo();

        // dial phone numbers
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    public static void configCellPhone(CellPhone cellPhone, Scanner input) {

        // prompt and accept input
        System.out.print("\nWhat is the serial number? ");
        int serialNumber = input.nextInt();
        cellPhone.setSerialNumber(serialNumber);
        input.nextLine();

        System.out.print("What model is the cellPhone? ");
        String model = input.nextLine();
        cellPhone.setModel(model);


        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.print("What is the cellPhone number? ");
        String cellPhone1Number = input.nextLine();
        cellPhone.setPhoneNumber(cellPhone1Number);

        System.out.print("Who is the owner of the cellPhone? ");
        String owner = input.nextLine();
        cellPhone.setOwner(owner);
    }
}
