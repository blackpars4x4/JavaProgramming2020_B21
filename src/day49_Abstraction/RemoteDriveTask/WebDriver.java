package day49_Abstraction.RemoteDriveTask;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();
}
