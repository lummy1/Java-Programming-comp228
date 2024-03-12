package Module05.InhTest;

class MountainBike extends Bicycle

{

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight)

    {

        super(gear, speed);

        this.seatHeight = seatHeight;

    }

    @Override

    public String toString()

    {

        return ("\nGear: " + gear + "\nSpeed: " + speed + "\nSeat Height: " + seatHeight);

    }

}
