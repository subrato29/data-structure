package recursion.tree;

/**
 * Print input String nth times
 */

public class Print_String_Nth_Times {

    public static void print (int iteration, int n) {
        if (iteration > n) {
            return;
        }
        System.out.println("Hello world: " + iteration);
        print(iteration + 1, n);
    }

    public static void main (String args[]) {
        print(1, 6);
    }

}
