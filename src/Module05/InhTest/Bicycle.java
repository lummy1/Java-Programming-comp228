//inheritance example a complete example

package Module05.InhTest;

public class Bicycle

{

    protected int gear;

    protected int speed;

    public Bicycle(int gear, int speed)

    {

        this.gear = gear;

        this.speed = speed;

    }

    public void applyBrake(int decrement)

    {

        speed -= decrement;

    }

    public void speedUp(int increment)

    {

        speed += increment;

    }

    public String toString()

    {

        return ("No of gears: " + gear + "\nspeed: " + speed);

    }

}
