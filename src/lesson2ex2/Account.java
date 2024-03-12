// Fig. 3.5: Account.java
// Account class with a constructor that initializes the name.
package lesson2ex2;

public class Account {
    // declare a variable to hold the balance
    private double balance;
    private String name; // instance variable
    //

    public double getBalance() {
        return balance;
    }

    //
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // constructor initializes name with parameter name
    public Account(String name, double balance) // constructor name is class name
    {
        this.name = name;
        this.balance = balance;
    }

    // method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // method to retrieve the name
    public String getName() {
        return name;
    }
} // end class Account
