package Day27_ForEachLoop;

public class UniqueStrings {
    public static void main(String[] args) {

        String[] arr = {"C#", "C#", "Java", "Python", "Python", "C++"};


        for (int j = 0; j <= arr.length-1; j++) {
            String element = arr[j]; //"C#"
            int frequency = 0;

            for (int i = 0; i <= arr.length-1; i++) {
                if (arr[i].equals(element)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.print(element + " ");
            }
        }

    }
}
