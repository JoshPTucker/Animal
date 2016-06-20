
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.eat();
		a.sleep();

		Cat c = new Cat("Tom");
		c.eat();
		c.sleep();
		System.out.print("This cats name is " +c.toString());
		

		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
		Dog d= new Dog();
		d.eat();
		d.sleep();
	    
		Shark s = new Shark();
		s.sleep();
		s.eat();
		s.swim();
	}
}