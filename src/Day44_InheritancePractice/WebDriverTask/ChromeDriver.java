package Day44_InheritancePractice.WebDriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver(String name, String version) {
        super("Chrome Browser", "V84.0.1");

    }

    @Override
    public void get(String URL) {
        System.out.println("Opening the ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("Closing the Chrome Driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Chrome Driver");
    }
}
