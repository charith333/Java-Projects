
 class animals{
	public void eat() {
		System.out.println("Animals eats with mouth.");
	}
	public void sleep() {
		System.out.println("Animals Sleep on ground");
	}
}
 
 class Dog extends animals {
	public void Sound() {
		System.out.println("Dog Barks");
	}
 }
 
 class Cat extends animals {
	 public void Likes() {
		 System.out.println("Cat likes Milk more.");
	 }

 }
public class InheritanceTask {

	public static void main(String[] args) {
	Dog d = new Dog();
	Cat c = new Cat();
	d.eat();
	d.sleep();
	d.Sound();
	c.eat();
	c.sleep();
	c.Likes();
	}

}
