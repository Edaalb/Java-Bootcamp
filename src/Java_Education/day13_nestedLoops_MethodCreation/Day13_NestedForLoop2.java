package Java_Education.day13_nestedLoops_MethodCreation;

public class Day13_NestedForLoop2 {
    public static void main(String[] args) {
        /*
        Create a code that prints the shape below
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // get the below line when inner loop finishes
        }
    }
}
