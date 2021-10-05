package vehiclesTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    Chassis chassis;
    ElectricCar electricCar;
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

        electricCar = new ElectricCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void electricCarHasTyres() {
        assertEquals(Tyres.ALLWEATHER, electricCar.getTyres());
    }
}
