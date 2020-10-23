package day06_ArithmeticOperators;

public class AboutMySelf {

    public static void main(String[] args) {
       //  String firstName = "John" , lastName = "Daniel" , fullName = firstName + " "+lastName;

        String firstName = "James";
        String lastName = "Bound";
        String fullName = firstName + " "+lastName;

        String from = "USA";
        String favoriteBook = "Data Structure in Java";
        String favoriteShow = "Game Of Throne";

        System.out.println("Full name is: " + fullName);
        System.out.println("From: "+from );
        System.out.println("Favorite book is: \""  + favoriteBook + "\"");
        System.out.println("Favorite Show is: " +  "\"" + favoriteShow + "\"" );




    }

}

/*
 variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow

    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite boos is: "YourFavoriteBook"
        Favorite Show is: "YourFavoriteShow"


        \"     \"
 */