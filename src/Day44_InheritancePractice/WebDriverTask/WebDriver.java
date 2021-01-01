package Day44_InheritancePractice.WebDriverTask;

public class WebDriver {

    public String name, version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening the default Remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver ");
    }
    public void maximize() {
        System.out.println("Maximizing the remote driver windows ");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

/*
1. create a class called RemoteWebDriver
			name, version
			add a constructor to set the instances
			get(URL), maximize(), close()
 */
