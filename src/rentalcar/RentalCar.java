package rentalcar;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */

public class RentalCar
{

    private boolean rented;
    private static int numAvailable = 0;
    private static int numRented = 0;

    /**
     * Constructs a rental car.
     */
    public RentalCar()
    {
        rented = false;
        numAvailable += 1;
    }

    /**
     * Get number of cars available
     *
     * @return count of cars that are available
     */
    public static int numAvailable()
    {
        return numAvailable;
    }

    /**
     * Get number of cars rented
     *
     * @return count of cars that are rented
     */
    public static int numRented()
    {
        return numRented;
    }

    /**
     * Try to rent this car.
     *
     * @return true if the car was successfully rented, false if it was already
     * rented.
     */
    public boolean rentCar()
    {
        if (!rented)
        {
            rented = true;
            numAvailable -= 1;
            numRented += 1;
        }
        return rented;
    }

    /**
     * Return rented car.
     *
     * @return true if the car was previously rented and is now returned, false
     * if it was not previously rented.
     */
    public boolean returnCar()
    {
        if (rented)
        {
            numAvailable += 1;
            numRented -= 1;
        }
        return !rented;
    }

    /**
     * This method is used for checking your work. Do not modify it.
     * @param n who cares
     * @return who knows
     */
    public static String check(int n)
    {
        RentalCar[] cars = new RentalCar[n];
        for (int i = 0; i < n; i++)
        {
            cars[i] = new RentalCar();
        }
        for (int i = 0; i < n; i = i + 2)
        {
            cars[i].rentCar();
        }
        for (int i = 0; i < n; i = i + 3)
        {
            cars[i].rentCar();
        }
        for (int i = 0; i < n; i = i + 4)
        {
            cars[i].returnCar();
        }
        return RentalCar.numAvailable() + " " + RentalCar.numRented();
    }
}
