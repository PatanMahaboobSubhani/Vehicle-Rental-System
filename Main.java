public abstract class Vehicle {
    protected String vehicleNumber;
    protected String model;

    public Vehicle(String vehicleNumber, String model) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
    }

    // Abstract method for calculating rent
    public abstract double calculateRent(int days);

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Model: " + model);
    }
}

public class Bike extends Vehicle {
    private double ratePerDay = 200;

    public Bike(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}

public class Car extends Vehicle {
    private double ratePerDay = 800;

    public Car(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}

public class Truck extends Vehicle {
    private double ratePerDay = 1500;

    public Truck(String vehicleNumber, String model) {
        super(vehicleNumber, model);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike("B101", "Yamaha FZ");
        Vehicle car = new Car("C202", "Honda City");
        Vehicle truck = new Truck("T303", "Tata Ace");

        int rentalDays = 5;

        Vehicle[] vehicles = {bike, car, truck};
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Rent for " + rentalDays + " days: ₹" + v.calculateRent(rentalDays));
            System.out.println("-----");
        }
    }
}
