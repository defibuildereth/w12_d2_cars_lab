package behaviours;

import traders.Customer;
import vehicles.Vehicle;

public interface ITradeVehicles {

    void buyVehicle(Vehicle vehicle, ITradeVehicles seller);
    void sellVehicle(Vehicle vehicle, ITradeVehicles buyer);

    void reduceMoney(int price);
    void addMoney(int price);

    void addVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
}
