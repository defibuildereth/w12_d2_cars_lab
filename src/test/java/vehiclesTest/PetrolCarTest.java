package vehiclesTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Engine;
import parts.Gearbox;
import parts.Tyres;
import vehicles.PetrolCar;


import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    Chassis chassis;
    PetrolCar petrolCar;
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

        petrolCar = new PetrolCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void petrolCarHasEngine() {
        assertEquals(Engine.PETROL, petrolCar.getEngine());
    }
}
