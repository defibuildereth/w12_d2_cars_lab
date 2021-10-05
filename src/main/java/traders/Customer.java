package traders;

import behaviours.ITradeVehicles;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements ITradeVehicles {

    private int money;
    private ArrayList<Vehicle> cars;
    private String name;

    public Customer(int money, String name) {
        this.money = money;
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Vehicle> cars) {
        this.cars = cars;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.cars.remove(vehicle);
    }

    public void reduceMoney(int price) {
        this.money -= price;
    }

    public void sellVehicle(Vehicle vehicle, ITradeVehicles buyer) {
        if (this.cars.contains(vehicle)) {
        removeVehicle(vehicle);
        buyer.reduceMoney(vehicle.getPrice());
        addMoney(vehicle.getPrice());
        }
    }

    public void addVehicle(Vehicle vehicle) {
        this.cars.add(vehicle);
    }

    public void addMoney(int price) {
        this.money += price;
    }

    public void buyVehicle(Vehicle vehicle, ITradeVehicles seller) {
        if (this.money > vehicle.getPrice()) {
            addVehicle(vehicle);
            reduceMoney(vehicle.getPrice());
            seller.addMoney(vehicle.getPrice());
            seller.removeVehicle(vehicle);
        }
    }



}
