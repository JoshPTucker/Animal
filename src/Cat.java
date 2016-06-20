
public class Cat extends Animal {
	String name;
	
	public Cat(String name){
		this.name=name;
	}
	public void sleep(){
		System.out.println("Cats sleep alot");
	}
	public void eat(){
		System.out.println("Cats eat mice and birds");
	
    }
	public String toString(){
		return name;
		
	}
	
}
