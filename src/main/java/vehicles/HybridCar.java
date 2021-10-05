package vehicles;

import parts.Chassis;
import parts.Engine;
import parts.Gearbox;
import parts.Tyres;

public class HybridCar extends Vehicle{

    public HybridCar(Tyres tyres, Gearbox gearbox, Chassis chassis, String colour, int price) {
        super(tyres, gearbox, chassis, colour, price);
        this.engine = Engine.HYBRID;
    }
}
