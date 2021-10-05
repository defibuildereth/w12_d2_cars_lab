package partsTest;

import org.junit.Before;
import org.junit.Test;

import parts.Chassis;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis chassis;
    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new electricCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void carHasChassis() {
        assertEquals("SoftTop", electricCar.getChassis());
    }
}
