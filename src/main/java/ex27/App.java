/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex27;
import java.util.Scanner;

public class App 
{
    public static boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static String validateFirstName(String firstName) {
        if(firstName.length() >= 2)
            return null;
        if(firstName.length() == 0) {
            return "The first name must be filled in.\n";
        }
        return firstName + " is not a valid first name. It is too short.\n";
    }

    public static String validateLastName(String lastName) {
        if(lastName.length() >= 2)
            return null;
        if(lastName.length() == 0) {
            return "The last name must be filled in.\n";
        }
        return lastName + " is not a valid last name. It is too short.\n";
    }

    public static String validateZipCode(String zipCode) {
        if(isNumeric(zipCode))
            return null;
        return "The ZIP code must be numeric.\n";
    }

    public static String validateEmployeeID(String employeeID) {
        if(employeeID.matches("^[A-Z]{2}-[0-9]{4}$"))
            return null;
        return employeeID + " is not a valid ID\n";
    }

    public static String validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        String inputErrors = "";
        String validatedFirstName = validateFirstName(lastName);
        String validatedLastName = validateLastName(lastName);
        String validatedZipCode = validateZipCode(zipCode);
        String validatedEmployeeID = validateEmployeeID(employeeID);
        if(validatedFirstName != null)
            inputErrors += validateFirstName(firstName);
        if(validatedLastName != null)
            inputErrors += validateLastName(lastName);
        if(validatedZipCode != null)
            inputErrors += validateZipCode(zipCode);
        if(validatedEmployeeID != null)
            inputErrors += validateEmployeeID(employeeID);
        if(inputErrors == "")
            inputErrors += "There were no errors found.\n";
        return inputErrors;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String firstName, lastName, zipCode, employeeID;
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zipCode = input.next();
        System.out.print("Enter an employee ID: ");
        employeeID = input.next();
        System.out.println(validateInput(firstName, lastName, zipCode, employeeID));



    }
}
