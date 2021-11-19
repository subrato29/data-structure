package javaconcept.recursion;

public class Recursion {

    public static void reducedByOne(int num) {
        if (num > 0) {
            reducedByOne(num - 1);
        }
        System.out.println(num);
    }

    public static int reducedByOne1(int num) {
        if (num > 0) {
            num = num - 1;
            reducedByOne1(num);
        }
        return num;
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
    /*
	factorial(5) 
	   factorial(4) 
	      factorial(3) 
	         factorial(2) 
	            factorial(1) 
               return 1 
            return 2*1 = 2 
         return 3*2 = 6 
      return 4*6 = 24 
   return 5*24 = 120
	*/

    public static void main(String[] args) {
        //reducedByOne (10);
        //System.out.println(reducedByOne1 (10));
        System.out.println(factorial(5));
    }

}