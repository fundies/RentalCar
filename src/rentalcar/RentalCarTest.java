/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class RentalCarTest {
    private int preValue;

    /**
     * Default Constructor.
     */
    public RentalCarTest() {
        preValue = 0;
    }

    /**
     * Test of numAvailable method, of class RentalCar.
     */
    @Test
    public final void testNumAvailable() {
        System.out.println("numAvailable");
        preValue = RentalCar.numAvailable();
        new RentalCar();
        assertEquals(RentalCar.numAvailable(), preValue + 1);
    }

    /**
     * Test of numRented method, of class RentalCar.
     */
    @Test
    public final void testNumRented() {
        System.out.println("numRented");
        preValue = RentalCar.numRented();
        RentalCar instance = new RentalCar();
        instance.rentCar();
        assertEquals(RentalCar.numRented(), preValue + 1);
    }

    /**
     * Test of rentCar method, of class RentalCar.
     */
    @Test
    public final void testRentCar() {
        System.out.println("numRented");
        preValue = RentalCar.numRented();
        RentalCar instance = new RentalCar();
        instance.rentCar();
        assertEquals(RentalCar.numRented(), preValue + 1);
    }

    /**
     * Test of returnCar method, of class RentalCar.
     */
    @Test
    public final void testReturnCar() {
        System.out.println("returnCar");
        RentalCar instance = new RentalCar();
        instance.rentCar();
        preValue = RentalCar.numRented();
        instance.returnCar();
        assertEquals(RentalCar.numRented(), preValue - 1);

        RentalCar car = new RentalCar();
        boolean expResult2 = true;
        boolean result2 = car.returnCar();

        assertEquals(expResult2, result2);
    }

    /**
     * Test of check method, of class RentalCar.
     */
    @Test
    public final void testCheck() {
        System.out.println("check");

        int preRent = RentalCar.numRented();
        int preAvail = RentalCar.numAvailable();

        RentalCar.check(10);

        int expRent = preRent + 4;
        int expAvail = preAvail + 6;

        assertEquals(expRent, RentalCar.numRented());
        assertEquals(expAvail, RentalCar.numAvailable());
    }

}
