package day41_Enclapsulation;

public class Credentials {

    private String userName = "cybertek";
    private double password = 1234;


    public String getUserName() {
        return userName;
    }

    public double getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        /*if(userName.length() < 8){
            return;
        }*/
        this.userName = userName;
    }

    public void setPassword(double password) {

        this.password = password;
    }



}
