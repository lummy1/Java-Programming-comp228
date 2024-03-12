//Person class, the parent class

package PP;

public class Person

{

    protected String name; // instance variable type string

    public Person(String aName) // one-argument constructor

    {

        name = aName;

    }

    public void setName(String theNewName)

    {

        name = theNewName;

    }

    public String getName()

    {

        return name;

    }

    @Override

    public String toString() // string representation of the object of this parent class

    {

        return ("\nName: " + name);

    }

}
