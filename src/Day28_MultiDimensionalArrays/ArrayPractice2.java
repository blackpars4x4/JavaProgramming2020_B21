package Day28_MultiDimensionalArrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String [] employeeNames = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat"};
        //        index numbers:      0         1       2       3           4

        int[] employeeSalary = { 100000, 110000, 105000, 120000, 120000};
        //        index numbers:   0        1      2       3        4

        int max = employeeSalary[0];
        String nameOfMax = "";

        int min = employeeSalary[0];
        String nameOfMin = "";

        for(int i = 0; i <= employeeNames.length-1; i++){//i: 0,1,2,3,4

            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);

            if(employeeSalary[i] > max){
                max = employeeSalary[i];
                nameOfMax = employeeNames[i];
            }
            if(employeeSalary[i] < min){
                min = employeeSalary[i];
                nameOfMin = employeeNames[i];
            }
        }
        System.out.println();
        System.out.println(nameOfMax + " has the max salary: " + max);
        System.out.println();
        System.out.println(nameOfMin + " has the max salary: " + min);
    }
}
