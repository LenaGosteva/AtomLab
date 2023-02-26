public class Car {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    public String brand;
    public String ownerName;
    public int weight;

    public Car() {
        this.brand = "BMW";
        this.weight = 2000;
        this.ownerName = "Иванов Иван Иванович";
    }

    public Car(int id,String brand, int weight, String ownerName) {
        this.id = id;
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