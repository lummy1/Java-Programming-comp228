package Week04;

public class Main {
    public static void main(String[] args) {
        // Level myVar = Level.HIGH;
        // switch (myVar) {
        // case LOW:
        // System.out.println("Low level");
        // break;
        // case MEDIUM:
        // System.out.println("Medium level");
        // break;
        // case HIGH:
        // System.out.println("High level");
        // break;
        // default:
        // System.out.println("None of the levels applies.");
        // }

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

    }
}
