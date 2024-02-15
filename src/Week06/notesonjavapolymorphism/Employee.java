package Week06.notesonjavapolymorphism;

/* File name : Employee.java */

public class Employee {

    private String name;
    private String address;
    private int number;

    // Constructor to initialize the Employee properties
    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Method to simulate mailing a check to the employee
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    // Method to provide a string representation of the Employee
    public String toString() {
        return name + " " + address + " " + number;
    }

    // Getter method to retrieve the employee's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the employee's address
    public String getAddress() {
        return address;
    }

    // Setter method to update the employee's address
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    // Getter method to retrieve the employee's number
    public int getNumber() {
        return number;
    }
}
