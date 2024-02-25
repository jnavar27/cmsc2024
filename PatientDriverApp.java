package JNavarro_Assignment2_Complete;

import java.util.Scanner;

public class PatientDriverApp 
{
    public static void main(String[] args) 
    {
    	String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone;
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Middle Name: ");
        middleName = scanner.nextLine();
        
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Street Address: ");
        streetAddress = scanner.nextLine();
        
        System.out.print("City: ");
        city = scanner.nextLine();
        
        System.out.print("State: ");
        state = scanner.nextLine();
        
        System.out.print("ZIP Code: ");
        zipCode = scanner.nextLine();
        
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        
        System.out.print("Emergency Contact Name: ");
        emergencyContactName = scanner.nextLine();
        
        System.out.print("Emergency Contact Phone: ");
        emergencyContactPhone = scanner.nextLine();
     
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);

        System.out.println("\nEnter information for Procedure 1:");
        Procedure procedure1 = createProcedure(scanner);

        System.out.println("\nEnter information for Procedure 2:");
        Procedure procedure2 = createProcedure(scanner);

        System.out.println("\nEnter information for Procedure 3:");
        Procedure procedure3 = createProcedure(scanner);

        scanner.close();

        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        System.out.println("Total Charges for all procedures: $" + calculateTotalCharges(procedure1, procedure2, procedure3));
        System.out.println("\nStudent Name: Jeffrey Navarro");
        System.out.println("MC#: M21169889");
        System.out.println("Due Date: 02/26/24");
    }

    public static Procedure createProcedure(Scanner scanner) 
    {
        System.out.print("Procedure Name: ");
        String procedureName = scanner.nextLine();
        System.out.print("Procedure Date: ");
        String procedureDate = scanner.nextLine();
        System.out.print("Practitioner Name: ");
        String practitionerName = scanner.nextLine();
        System.out.print("Procedure Charges: ");
        double procedureCharges = scanner.nextDouble();
        scanner.nextLine(); 

        return new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
    }
    public static void displayPatient(Patient patient) {
        System.out.println("Patient Info:");
        System.out.println("\tFull Name: " + patient.buildFullName());
        System.out.println("\tAddress: " + patient.buildAddress());
        System.out.println("\tPhone Number: " + patient.getPhoneNumber());
        System.out.println("\tEmergency Contact: " + patient.buildEmergencyContact());
        System.out.println();
    }
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\t\tProcedure: " + procedure.getProcedureName());
        System.out.println("\t\tProcedure Date: " + procedure.getProcedureDate());
        System.out.println("\t\tPractitioner: " + procedure.getPractitionerName());
        System.out.println("\t\tCharge: $" + String.format("%.2f", procedure.getProcedureCharges()));
        System.out.println();
    }
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
}

