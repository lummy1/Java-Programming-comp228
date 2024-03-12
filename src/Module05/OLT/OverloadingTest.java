package Module05.OLT;

public class OverloadingTest

{

    public static void main(String[] args)

    {

        B b = new B();

        b.p(5);

        b.p(12.5);

        A a = new A();

        // a.p(8.0); not possible

        a.p(9);

    }

}
