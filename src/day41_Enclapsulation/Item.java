package day41_Enclapsulation;

public class Item {
    public String name;
    public int quantity;
    public double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }



    public double calcCost(){
        return quantity * unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name=" + name +
                ", quantity=" + quantity +
                ", unitPrice= $" + unitPrice +
                ", total price= $" + calcCost()+
                '}';
    }
}
/*
create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: totalCost = quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
