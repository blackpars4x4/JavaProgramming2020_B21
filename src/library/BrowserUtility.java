package library;

public class BrowserUtility {

    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
