package objects;

public class Animal {
	
	String animal;
	int age;
	int weight;
	String food;
	
	
	
	
	
	
	public Animal(String animal, int age, int weight, String food) {
		super();
		this.animal = animal;
		this.age = age;
		this.weight = weight;
		this.food = food;
	}

	public void eat(){
		System.out.println("I am "+ animal);
		System.out.println("I am " + age + " old");
		System.out.println("I eat " + food);
		
	}

	
	public void sleep() {
		System.out.println("Sleeping...");
	}
}
