package Week05.CTI;

public class BaseTest {
    public static void main(String[] args) {
        Derived d = new Derived();
        Derived d2 = new Derived("Syed Yamin");
        System.out.println(d);
        System.out.println(d2);
    }
}