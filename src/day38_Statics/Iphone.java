package day38_Statics;

public class Iphone {

    public String model, color, storage;
    public int price;

    public static String brand = "Apple", OS = "iOS", madeIn = "China";

    public void call(long phoneNumber){
        System.out.println("Iphone"+model+"is calling"+phoneNumber);
    }
    public void setInfo(String brand, String model, String color, int price, String OS){
        Iphone.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        Iphone.OS = OS;
    }

    public static void getInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + OS);
        System.out.println("Made in: " + madeIn);
       /* System.out.println(price);*/
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "Model=" + model +
                ", Color=" + color +
                ", price=" + price +
                ", Operating System: "+OS;
    }
}
/*
iphone:
	attributes:
			instance: model, color, price, storage
			static: brand, operating system, madeIn, deignated
 */