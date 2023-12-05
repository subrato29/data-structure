package recursion.tree;

/**
 * Print 1 to N by backtracking
 */
public class Print_1_to_N_By_BackTracking {
    public static void print (int iteration, int n) {
        if (iteration < 1) {
            return;
        }
        print(iteration - 1, n);
        System.out.println(iteration); //printing after function call
    }

    public static void main (String[] args) {
        print(3, 3);
    }
}
