//derived class with constructor

package CTI;

class Derived extends Base

{

    String name;

    public Derived()

    {

        System.out.println("Derived class constructor called.");

    }

    public Derived(String name) // overloaded constructor

    {

        this.name = name;

        System.out.println("Derived class overloaded constructor called.");

    }

    @Override

    public String toString()

    {

        return "\nName: " + name;

    }

}
