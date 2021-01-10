package Day46_JavaRecap;

public class MorningWorkOut {

    public static void main(String[] args) {

        for(int i = 1; i <=30; i++) {
            System.out.println("Puch Up" + i);
            sleep(1.5);
        }

        System.out.println("===================================================");


        for(int i = 1; i <=20; i++){
            System.out.println("Pull Up " + i);
            sleep(2.5);
        }

    }




    public static void sleep(double seconds) {
       try {
           Thread.sleep((long) (seconds * 1000));
       }catch(InterruptedException e) {

       }
    }
}
