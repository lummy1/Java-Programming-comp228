package Module05.CTI;

//Derived driver class

class Derived extends Base

{
    String name;

    public Derived() {
        super(0); // or another default age
        this.name = "";
        System.out.println("Derived class default constructor with parent constructor called.");
    }

    public Derived(String name) {
        super(0); // or another default age
        this.name = name;
        System.out.println("Derived class constructor with one parameter (name) with parent constructor called.");
    }

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
