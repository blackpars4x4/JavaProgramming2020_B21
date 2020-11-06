package Day23_NestedLoop;

/*
cybertek
cybertek12345
*/

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.nextLine();

        System.out.println("Enter your password");
        String password = scan.nextLine();

        if(username.equals("cybertek") && password.equals("cybertek12345")){
            System.out.println("Logged in");
        }else{// condition for invalid entry...
            for(int i = 1; i <= 3; i++) {

                if(i == 3){
                    System.err.println("Your account is locked");
                    System.exit(0);
                }
                System.out.println("Invalid Username or Password. Please re-enter");
                System.out.println("Enter your username");
                username = scan.nextLine();

                System.out.println("Enter your password");
                password = scan.nextLine();

                if(username.equals("cybertek") && password.equals("cybertek12345")){
                    System.out.println("Logged in");
                    break;
                }
            }
        }




    }
}
