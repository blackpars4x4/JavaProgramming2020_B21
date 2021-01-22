package day49_Abstraction.ShapeTask.ShapeTask;

public class Test {
    public static double PI;
    public double nums;

    static {
        PI = 3.14;
    }

    public Test(double nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        System.out.println(Test.PI);
        System.out.println();
    }
}
class Test2 {
    public static void main(String[] args) {
        Test test = new Test(5.5);

        }
}
