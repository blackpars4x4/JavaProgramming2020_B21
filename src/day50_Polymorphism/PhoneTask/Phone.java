package day50_Polymorphism.PhoneTask;

public abstract class Phone {
    public String brand, model, size, color;
    public  double price;

    public Phone(String brand, String model, String size, String color, double price) {
        if(price < 0){
            throw new RuntimeException("Invalid Price, cannot be negative");
        }

        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public abstract void text();

    public abstract void call();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
4. create an abstract class named Phone
            instance variables: brand, model, price, size, color
            abstract methods: texting(), calling()

            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
 */