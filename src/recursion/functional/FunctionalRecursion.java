package recursion.functional;

public class FunctionalRecursion {

    public static int sum (int counter) {
        if (counter == 0) {
            return 0;
        }
        return counter + sum (counter - 1);
    }

    public static void main (String[] args) {
        System.out.println(sum (5));
    }
}
