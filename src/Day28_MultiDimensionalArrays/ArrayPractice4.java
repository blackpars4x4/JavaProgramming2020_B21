package Day28_MultiDimensionalArrays;

public class ArrayPractice4 {
    public static void main(String[] args) {
        String[] employeeNames = { "Asel", "Afrooz", "Safa", "Suveyda", "Rinat", "Aliya", "Bektemir", "Pedro"};
        int employeeSalary[]= { 100000, 110000, 105000, 120000, 125000, 125000, 125000, 100000 };

        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each > max){
                max = each;
            }
        }
        System.out.println("Max: "+ max);

        for (int i = 0; i <= employeeNames.length-1; i++){
            if(max == employeeSalary[i]){

                System.out.println( employeeNames[i]);
            }
        }

    }
}
