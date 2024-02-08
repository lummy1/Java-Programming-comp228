// Person class, the parent class
package Week05.CTI;

import Week05.Professor;

// PersonTest class, the driver class
public class Person {
    public static void main(String[] args) {
        Person person1 = new Person("John Bailey");
        System.out.println("Name of this person: " + person1);

        Professor prof1 = new Professor("Syed Yamin", "SETAS", 001);
        System.out.println(prof1);
    }

    protected String name; // instance variable type string

    public Person(String aName) {
        name = aName;
    }

    public void setName(String theNewName) {
        name = theNewName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("\nName: " + name);
    }
}
