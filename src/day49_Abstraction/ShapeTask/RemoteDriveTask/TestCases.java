package day49_Abstraction.ShapeTask.RemoteDriveTask;

public class TestCases {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.TakeScreenShot("pic");
        driver.close();

        System.out.println("-----------------------------------------------------");

        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.google.com");
        driver2.TakeScreenShot("pic");
        driver.close();

        System.out.println("-----------------------------------------------------");

        WebDriver driver3 = new ChromeDriver(); //Polymorphism

    }
}
