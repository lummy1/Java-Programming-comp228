//Professor class, the inherited class

package PP;

public class Professor extends Person

{

    protected String department; // instance variable, a string,at this level

    // declared as protected allow class classes

    // inherit from this class

    protected int id; // another instance variable, an integer, at this level

    public Professor(String aName, String aDepartment, int anId)

    {

        super(aName); // a call to the parent constructor, must be the first statement

        // in the constructor

        department = aDepartment;

        id = anId;

    }

    public void setDepartment(String aDepartment) // sets department value

    {

        department = aDepartment;

    }

    public String getDepartment() // returns the current value of department

    {

        return department;

    }

    @Override

    public String toString() // string representation of the object of this inherited class

    {

        return ("\nName:" + name + "\nDepartment: " + department + "\nId: " + id);

    }

}
