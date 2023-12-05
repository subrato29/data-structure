package recursion.tree;

public class ReturnFunction {

    static int counter = 0;
    static void print () {
        if (counter == 4) {
            return; //return is end of a function in call stack
        }
        counter++;
        System.out.println(counter);
        print();
    }

    public static void main (String[] args) {
        print();
    }
}
