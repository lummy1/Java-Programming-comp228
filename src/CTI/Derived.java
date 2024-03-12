package CTI;

//Derived driver class

class Derived extends Base

{
    String name;

    public Derived(int age, String name)

    {

        super(age);

        this.name = name;

        System.out.println("Derived class constructor with parent constructor called.");

    }

    @Override

    public String toString()

    {

        return "\nname: " + name + "\nAge: " + age;

    }

    public static void main(String[] args)

    {

        Derived myDerived = new Derived(33, "Syed Yamin");

        System.out.println(myDerived);

    }

}
