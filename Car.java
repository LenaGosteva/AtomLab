public class Car {
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