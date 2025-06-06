
abstract class Car{
	abstract void Features();
	public void Implementation(){
		System.out.println("Press Accelerator to go.");
	}
}
class car1 extends Car{
	void Features(){
		System.out.println("Car Works with BS6 Engine");
	}
}
public class AbstractionTask {

	public static void main(String[] args) {
		car1 c= new car1();
		c.Implementation();

	}

}
