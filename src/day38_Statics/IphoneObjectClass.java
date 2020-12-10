package day38_Statics;

public class IphoneObjectClass {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone();

        Iphone phone2 = new Iphone();

        Iphone phone3 = new Iphone();

        Iphone phone4 = new Iphone();


        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);

        System.out.println("========================================");
        Iphone.getInfo();

    }
}
