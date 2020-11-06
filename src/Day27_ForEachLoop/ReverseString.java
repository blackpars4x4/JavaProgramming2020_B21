package Day27_ForEachLoop;

public class ReverseString {
    public static void main(String[] args) {

        String[] names = {"Dervis", "Aysel", "Burak", "Ibrahim", "Emre"};

        for(String eachName : names){

            String reversedName = "";
            for (int i = eachName.length()-1; i >= 0; i--){
                reversedName += eachName.charAt(i);

            }
            System.out.println(reversedName);
        }
    }
}
