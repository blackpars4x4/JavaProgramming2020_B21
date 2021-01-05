package day45_Exceptions.PhoneTask;

public class Device {

    public String brand, model;
    public String country;
    public double price;


    public Device(String brand, String model, String country, double price) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.price = price;
    }



    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
/*
create a class called device:
				attributes: brand, model, price, country
				methods: toString
 */