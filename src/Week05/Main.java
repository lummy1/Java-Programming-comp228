package Week05;

public class Main {

    public static void main(String[] args) {
        // Create a CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
                "John", "Doe", "123-45-6789", 5000.0, 0.1);

        // Display employee information using toString method
        System.out.println("Employee Information:");
        System.out.println(employee);

        // Update gross sales and commission rate
        employee.setGrossSales(6000.0);
        employee.setCommissionRate(0.12);

        // Display updated information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("Gross Earnings: $" + employee.earnings());
        System.out.println(employee);
    }
}
