package vehiclesTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import vehicles.DieselCar;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    Chassis chassis;
    DieselCar dieselCar;
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

        dieselCar = new DieselCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void dieselCarHasGearbox() {
        assertEquals(Gearbox.AUTOMATIC, dieselCar.getGearbox());
    }
}
