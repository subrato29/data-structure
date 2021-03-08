package practice;

public class Outer {

	public void outerMethod () {
		System.out.println("This is an example of outer class");
	}
	class Inner {
		public void innerMethod () {
			System.out.println("This is an example of inner class");
		}
	}
	
	public static void main(String[] args) {
		//Outer.Inner inner = new Outer.Inner ();
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();
		//inner.outerMethod();

	}

}
