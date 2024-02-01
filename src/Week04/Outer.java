package Week04;

public class Outer {
    public void outerMethod() {
        System.out.println("outerMethod");
    }

    static class Nested_Demo
    {
        public void my_method() {
            System.out.println("nested class");
        }
    }

    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();

        Outer outer = new Outer();
        outer.outerMethod();
    }
}
