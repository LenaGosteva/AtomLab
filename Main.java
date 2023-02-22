import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Put in brand: ");
        String brand = new Scanner(System.in).next();
        System.out.print("Put in weight: ");
        int weight = new Scanner(System.in).nextInt();
        System.out.print("Put in owner name: ");
        String ownerName = new Scanner(System.in).next();


        Car car = new Car(brand, weight, ownerName);
        System.out.println(car.toString());
    }
}

class Car {
    public String brand;
    public String ownerName;
    public int weight;

    public Car() {
        this.brand = "BMW";
        this.weight = 2000;
        this.ownerName = "Иванов Иван Иванович";
    }

    public Car(String brand, int weight, String ownerName) {
        this.brand = brand;
        this.ownerName = ownerName;
        this.weight = weight;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Автомобилем марки " + brand +" общей массой "+ weight+" кг. владеет "+ownerName+".";
    }
}