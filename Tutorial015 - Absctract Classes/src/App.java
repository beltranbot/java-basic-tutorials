
public class App {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		// Java doesn't allow us to instantiate
		// object from an abstract class
		// Machine machine1 = new Machine();
		
		car1.run();
		
	}

}
