//Name:Michael Antigua
//Cmsc 203
// Description: This is the patient driver app part of the code

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter patient first name, middle name, last name:");
        String first = scanner.nextLine();
        String middle = scanner.nextLine();
        String last = scanner.nextLine();

        System.out.println("Enter street address, city, state, zip code:");
        String address = scanner.nextLine();
        String city = scanner.nextLine();
        String state = scanner.nextLine();
        String zip = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter emergency contact name and phone:");
        String emergencyName = scanner.nextLine();
        String emergencyPhone = scanner.nextLine();

        Patient patient = new Patient(first, middle, last, address, city, state, zip, phone, emergencyName, emergencyPhone);

        Procedure proc1 = new Procedure("X-ray", "06/12/2023", "Dr. Smith", 250.00);
        Procedure proc2 = new Procedure("Blood Test", "06/13/2023", "Nurse Lee", 150.00);
        Procedure proc3 = new Procedure("MRI", "06/14/2023", "Dr. Adams", 750.00);

        
        displayPatient(patient);

        
        displayProcedure(proc1);
        displayProcedure(proc2);
        displayProcedure(proc3);

        double total = calculateTotalCharges(proc1, proc2, proc3);
        System.out.printf("Total Charges: $%,.2f\n", total);

        scanner.close();
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getProcedureCharge() + p2.getProcedureCharge() + p3.getProcedureCharge();
    }
}
