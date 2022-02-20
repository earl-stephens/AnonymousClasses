package application;

public class App {
	
	private String name = "Jojo";

	public static void main(String[] args) {
		new App().start();
	}

	public void start() {
		/* Can't instantiate an interface, but can use this
		 * way to get around it.  This is an anonymous class, 
		 * it's not an actual class.  By using the run() method,
		 * you have in a way created a single object that implements
		 * the runnable interface.
		 * Anonymous classes can access instance and Final variables.
		 */
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println("1 " + name);
				// or
				System.out.println("2 " + App.this.name);
			}
		};
		
		activate(runner);
		
		// or
		
		activate(new Runnable() {
			public void run() {
				System.out.println("3 " + name);
			}
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}
}
