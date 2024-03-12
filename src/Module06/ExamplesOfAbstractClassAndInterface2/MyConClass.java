package Module06.ExamplesOfAbstractClassAndInterface2;

//2.5 Concrete class MyConClass

public class MyConClass extends MyAbClass implements Interface1, Interface2

{

    @Override

    public void hi()

    {

        System.out.println("Hi from overridden method hi() that was implemented from Interface1.");

    }

    @Override

    public void bye()

    {

        System.out.println("Bye from overridden method bye() that was implemented from Interface2.");

    }

    @Override

    public void myAbMethod()

    {

        System.out.println(
                "Bye from overridden method myAbMethod() that was implemented from the abstract class MyAbClass.");

    }

}
