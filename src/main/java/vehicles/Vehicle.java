package vehicles;

import parts.Chassis;
import parts.Engine;
import parts.Gearbox;
import parts.Tyres;

public abstract class Vehicle {

    protected Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;
    private Chassis chassis;
    private String colour;
    private int price;

    public Vehicle(Tyres tyres, Gearbox gearbox, Chassis chassis, String colour, int price) {

        this.tyres = tyres;
        this.gearbox = gearbox;
        this.chassis = chassis;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
