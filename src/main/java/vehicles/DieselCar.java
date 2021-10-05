package vehicles;

import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import parts.Engine;

public class DieselCar extends Vehicle{

    public DieselCar(Tyres tyres, Gearbox gearbox, Chassis chassis, String colour, int price) {
        super(tyres, gearbox, chassis, colour, price);
        this.engine = Engine.DIESEL;
    }


}
