package tradersTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import traders.Dealership;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Chassis chassis;
    ElectricCar electricCar;
    Tyres tyres;
    Gearbox gearbox;
    String colour;
    int price;
    Dealership dealership;

    @Before
    public void before() {
        tyres = Tyres.ALLWEATHER;
        gearbox = Gearbox.AUTOMATIC;
        chassis = Chassis.SUV;
        colour = "Red";
        price = 20000;

        electricCar = new ElectricCar(tyres, gearbox, chassis, colour, price);
        dealership = new Dealership(55000);
    }

    @Test
    public void hasStock() {
        dealership.addVehicle(electricCar);
        dealership.addVehicle(electricCar);
        assertEquals(2, dealership.getStock().size());
    }
}
