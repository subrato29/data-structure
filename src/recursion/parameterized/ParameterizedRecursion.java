package recursion.parameterized;

public class ParameterizedRecursion {

    public static void printSum (int counter, int sum) {
        if (counter == 0) {
            System.out.println(sum);
            return;
        }
        printSum(counter - 1, sum + counter);
    }

    public static void main (String[] args) {
        printSum (5, 0);
    }
}
