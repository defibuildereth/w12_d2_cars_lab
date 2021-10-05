package tradersTest;

import org.junit.Before;
import org.junit.Test;
import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import traders.Customer;
import vehicles.HybridCar;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
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
        customer = new Customer(25000, "Brian");


        hybridCar = new HybridCar(tyres, gearbox, chassis, colour, price);
    }

    @Test
    public void hasMoney() {
        assertEquals(25000, customer.getMoney());
    }

    @Test
    public void canBuyCar() {
        customer.buyVehicle(hybridCar);
        
        assertEquals(1, customer.getCars().size());
    }
    
    @Test
    public void cantBuy2Cars() {
        customer.buyVehicle(hybridCar);
        customer.buyVehicle(hybridCar);

        assertEquals(1, customer.getCars().size());
    }

    @Test
    public void canSellCar() {
        customer.addVehicle(hybridCar);
        customer.sellVehicle(hybridCar);

        assertEquals(45000, customer.getMoney());
    }

    @Test
    public void cantSellUnownedCar() {
        customer.sellVehicle(hybridCar);

        assertEquals(25000, customer.getMoney());
    }
}
