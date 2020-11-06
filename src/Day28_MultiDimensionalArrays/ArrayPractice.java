package Day28_MultiDimensionalArrays;

import java.util.Arrays;

public class ArrayPractice {
    /*
    ScrumTeam
    Tester: {"Dorin", "Adil", "Fatih", "Subhi"}
    Developer: {"Katrin", "Mustafa", "Ruslan"}
    SM: {"Ayse"}
    {"Omid"}
    {"Agalar"}
     */
    public static void main(String[] args) {

        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},
                {"Katrin", "Mustafa", "Ruslan"},
                {"Ayse"}, {"Omid"}, {"Agalar"},
                {"Ayse"},
                {"Omid"},
                {"Agalar"}
        };
        System.out.println(Arrays.deepToString(scrumTeam));

        for(int i = 0; i <= scrumTeam.length-1; i++){//i: index of 1D array
            System.out.println(Arrays.toString(scrumTeam[i]));
            for (int j = 0; j <= scrumTeam[i].length-1; j++){
                System.out.println(scrumTeam[i][j]);
            }

        }
        System.out.println("===============================================");

        for (String[] eachGroup : scrumTeam){// eachGroup: represents each 1D array in scrumTeam
            System.out.println(Arrays.toString(eachGroup));
            for(String eachName : eachGroup){
                System.out.println(eachName);
            }
        }

    }
}
