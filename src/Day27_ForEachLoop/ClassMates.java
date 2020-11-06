package Day27_ForEachLoop;

public class ClassMates {

    /*
    Create string array, and store the names of your class mates(10)
    print the first three characters of each name
     */

    public static void main(String[] args) {


        String[] classMates ={"Dervis", "Aysel", "Burak", "Ibrahim", "Emre", "Murat", "Umit", "Tarik", "Bahar","Sare"};

        for(String eachMates : classMates){

            String result = eachMates.substring(0,3);
            System.out.println(result);

        }

    }
}
