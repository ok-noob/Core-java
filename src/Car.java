class Vehicle {
    String brand;
    String colour;
    int year;
    String model;

    Vehicle(String brand, String colour, int year, String model) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.model = model;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand + ", Colour: " + colour + ", Year: " + year + ", Model: " + model);
    }
}

public class Car {
    public static void main(String[] args) {
        // Project1
        Vehicle toyota = new Vehicle("Toyota", "Black", 2003, "Corolla");
        toyota.startEngine();
        toyota.displayCarInfo();

        System.out.println();

        // Project2
        Vehicle ford = new Vehicle("Ford", "Silver", 2012, "F-150");
        ford.startEngine();
        ford.displayCarInfo();
    }
}