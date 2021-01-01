package day43_Inheritance.RestaurantTask;

public class LocalRestaurants {

    public static void main(String[] args) {
        Server[] servers = {
                new Server("Yasin", 29, 'M', 35, "Captain Server", "S001"),
                new Server("Sabryne", 28, 'F', 30, "Server Assistant", "S002"),
                new Server("Karim", 27, 'M', 25, "Server1", "S003"),
                new Server("Aysel", 26, 'F', 20, "Server2", "S004"),
                new Server("Kamal", 25, 'M', 15, "Server3", "S005"),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 'M', 25, "Head Cook", "C003"),
                new Chef("Habib", 22, 'M', 20, "Line Cook1", "C004"),
                new Chef("Bojan", 21, 'M', 15, "Line Cook2", "C005"),
        };



        Restaurant restaurant = new Restaurant("Mahdi");
        restaurant.hireServer( new Server("Mini", 25, 'F', 35, "Server", "C001") );
        restaurant.hireServer(servers);

        restaurant.hireChef(new Chef("Valeria", 24, 'F', 30, "Sous Chef", "C002") );
        restaurant.hireChef(chefs);
        System.out.println(restaurant);

        System.out.println("--------------------------------------------------------------------------");
        // display the names of servers
        double budget = 0 ;
        for (Server eachServer   : restaurant.servers ){
            System.out.println( eachServer.name );
            budget += eachServer.calcSalary();
        }

        System.out.println("--------------------------------------------------------");
        for(Chef eachChef : restaurant.chefs ){
            System.out.println(eachChef.name);
            budget += eachChef.calcSalary();
        }

        System.out.println("budget = " + budget);


    }

}
/*
   Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of the Restaurant object
            - Print your whole restaurants information
 */

