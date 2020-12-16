package day41_Enclapsulation;

public class Login {
    public static void main(String[] args) {
        Credentials obj = new Credentials();

        /*System.out.println(obj.userName);
        obj.userName = "ABC";

        System.out.println(obj.userName);*/

        System.out.println(obj.getUserName());

        System.out.println(obj.getPassword());

        // obj.getPassword() = 123;

        // obj.username = "HI";

        obj.setUserName("Hello");
        System.out.println(obj.getUserName());

        obj.setPassword(78910);
        System.out.println(obj.getPassword());


    }

}

