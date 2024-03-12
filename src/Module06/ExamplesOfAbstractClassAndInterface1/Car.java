package Module06.ExamplesOfAbstractClassAndInterface1;

//1.2 abstract class Car

public abstract class Car

{

    private String model;

    private String color;

    private int maxSpeed;

    public abstract void accelerate();

    public abstract void brake();

    public String getModel()

    {

        return model;

    }

    public void setModel(String model)

    {

        this.model = model;

    }

    public String getColor()

    {

        return color;

    }

    public void setColor(String color)

    {

        this.color = color;

    }

    public int getMaxSpeed()

    {

        return maxSpeed;

    }

    public void setMaxSpeed(int maxSpeed)

    {

        this.maxSpeed = maxSpeed;

    }

    @Override

    public String toString()

    {

        return ("\nModel: " + model + "\nColor: " + color + "\nMax Speed: " + maxSpeed);

    }

}
