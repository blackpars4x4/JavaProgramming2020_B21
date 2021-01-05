package day45_Exceptions.PhoneTask;

public class Huawai extends Phone {

    public Huawai(String model, double price) {
        super("Huawai", model, "China", price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }
}
