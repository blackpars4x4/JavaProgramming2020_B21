package day35_CustomClass;

public class Car {
    public String brand;  // instance variables
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){ // Instance methods
        brand =  carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+" "+color+" $"+price);
    }

}
/*
Car class:
		Attributes: instance variables
			brand, model, color, price, year....
		actions: instance methods
			driver(), stop()....
 */



