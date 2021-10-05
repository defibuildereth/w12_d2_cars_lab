package vehiclesTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Engine;
import parts.Gearbox;
import parts.Tyres;
import vehicles.HybridCar;


import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Chassis chassis;
    HybridCar hybridCar;
    Tyres tyres;
    Gearbox gearbox;
    String colour;
    int price;

    @Before
    public void before() {
        tyres = Tyres.ALLWEATHER;
        gearbox = Gearbox.AUTOMATIC;
        chassis = Chassis.SUV;
        colour = "Red";
        price = 20000;

        hybridCar = new HybridCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void HybridCarHasChassis() {
        assertEquals(Chassis.SUV, hybridCar.getChassis());
    }
}
