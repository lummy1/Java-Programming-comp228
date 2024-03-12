package Module04.Week4ClassDemos7;

//Week 4: Demo 7 Composition

//Driver

public class TestPerson

{

    public static void main(String[] args)

    {

        Person person = new Person();

        long salary = person.getSalary();

        System.out.println("\nThe salary of the person is $" + salary + ".");

    }

}

