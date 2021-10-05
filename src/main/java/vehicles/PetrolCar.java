package vehicles;

import parts.Chassis;
import parts.Gearbox;
import parts.Tyres;
import parts.Engine;

public class PetrolCar extends Vehicle{

    public PetrolCar(Tyres tyres, Gearbox gearbox, Chassis chassis, String colour, int price) {
        super(tyres, gearbox, chassis, colour, price);
        this.engine = Engine.PETROL;
    }
}
