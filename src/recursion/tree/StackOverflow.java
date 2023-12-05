package recursion.tree;

public class StackOverflow {

    static void print () {
        System.out.println("call me");
        print();
    }
    public static void main (String[] args) {
        print();
    }
}
