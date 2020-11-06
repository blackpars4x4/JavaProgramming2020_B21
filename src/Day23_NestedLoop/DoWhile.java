package Day23_NestedLoop;

public class DoWhile {
    public static void main(String[] args) {

        boolean condition = false;

        while (condition){//think first

            System.out.println("Hello Batch!!!");
        }

        System.out.println("=======================================");

        do {// do first, think later
            System.out.println("Hello Batch!!!");
        }while (condition);
    }
}
