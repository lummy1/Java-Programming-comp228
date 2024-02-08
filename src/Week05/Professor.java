package Week05;

import Week05.CTI.Person;

// Professor class, the inherited class

public class Professor extends Person {
    protected String department;
    protected int id;

    public Professor(String aName, String aDepartment, int anId) {
        super(aName); // a call to the parent constructor, must be the first statement
        department = aDepartment;
        id = anId;
    }

    public void setDepartment(String aDepartment) {
        department = aDepartment;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return ("\nName: " + name + "\nDepartment: " + department + "\nId: " + id);
    }
}
