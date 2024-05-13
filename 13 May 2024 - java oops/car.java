// Define the Car class
class Car {
    // Attributes or fields of the Car class
    String brand;
    String model;
    int year;

    // Constructor to initialize the Car object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the Car
    public void displayInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2020);

        // Calling the displayInfo method for each Car object
        System.out.println("Information about Car 1:");
        car1.displayInfo();

        System.out.println("\nInformation about Car 2:");
        car2.displayInfo();
    }
}
