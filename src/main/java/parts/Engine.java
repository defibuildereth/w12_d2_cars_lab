package parts;

public enum Engine {

    ELECTRIC(100.0),
    HYBRID(100),
    PETROL(150),
    DIESEL(130),
    LPG(120),
    HYDROGEN(200);

    private final double power;

    Engine(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }
}