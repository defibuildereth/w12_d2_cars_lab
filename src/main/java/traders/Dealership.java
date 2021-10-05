package traders;

import behaviours.ITradeVehicles;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements ITradeVehicles {

    private int money;
    private ArrayList<Vehicle> stock;

    public Dealership(int money) {
        this.money = money;
        this.stock = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Vehicle> stock) {
        this.stock = stock;
    }

    public void sellVehicle(Vehicle vehicle, ITradeVehicles buyer) {
         if (this.stock.contains(vehicle)) {
             removeVehicle(vehicle);
             int price = vehicle.getPrice();
             buyer.reduceMoney(price);
             addMoney(price);
         }
         }
    public void removeVehicle(Vehicle vehicle) {
        if (this.stock.contains(vehicle)) {
            this.stock.remove(vehicle);
        }
    }

    public void reduceMoney(int price) {
            if (this.money >= price) {
                this.money -= price;
            }
        }

    public void addMoney(int price) {
            this.money += price;
        }

    public void buyVehicle(Vehicle vehicle, ITradeVehicles seller) {
        reduceMoney(vehicle.getPrice());
        seller.addMoney(vehicle.getPrice());
        seller.removeVehicle(vehicle);
        addVehicle(vehicle);
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }
    }

