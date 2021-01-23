package day50_Polymorphism.PhoneTask;

public class IPhone extends Phone implements AppleApps {

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if(price > 1500) {
            throw new RuntimeException("Invalid Price, Iphone cannot be mpre than $1500");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from "+AppStoreName);
    }

    @Override
    public void text() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                '}';
    }
}

//Iphone Phone AppleApps