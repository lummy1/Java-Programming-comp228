package Week06.ExamplesOfAbstractClassAndInterface;

public class Sedan extends Car {
    private String navigationSys;

    @Override
    public void accelerate() {
        System.out.println("This sedan is now accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("This sedan is now slowing down.");
    }

    public String getNavigationSys() {
        return navigationSys;
    }

    public void setNavigationSys(String navigationSys) {
        this.navigationSys = navigationSys;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nNavigation System: " + navigationSys);
    }
}
