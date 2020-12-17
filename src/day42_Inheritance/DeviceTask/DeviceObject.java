package day42_Inheritance.DeviceTask;

public class DeviceObject {
    public static void main(String[] args) {


        Tv tv = new Tv("Samsung", "LX32", 499.99);

        System.out.println(tv);

        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();


        Phone phone = new Phone("iPhone", "12 Pro Max", 999.99);

        System.out.println(phone);
        phone.turnOn();
        phone.turnOff();
        phone.call(911);
        phone.text(123456);



    }
}
