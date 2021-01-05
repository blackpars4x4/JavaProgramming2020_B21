package day45_Exceptions.PhoneTask;

public class Phone extends Device {

    public Phone(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }

    public String toString() {
        return "Phone " + super.toString();
    }

    public void call(long number) {
        System.out.println(brand + " " + model + " is calling "+number);
    }

    public void text(long number) {
        System.out.println(brand + " " + model + " is calling "+number);
    }
}
/*
create a class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */