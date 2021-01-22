package day49_Abstraction.ShapeTask.RemoteDriveTask;

public class ChromeDriver extends RemoteDriver{


    @Override
    public void executeScript(String script) {
        System.out.println("Script "+ script+" is executed on Chrome");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking Screnshoot on chrome ");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting chrome");
    }

}
