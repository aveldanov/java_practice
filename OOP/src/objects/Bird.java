package objects;

public class Bird extends Animal {

	public Bird(String animal, int age, int weight, String food) {
		super(animal, age, weight, food);
		// TODO Auto-generated constructor stub
	}

//	public void fly() {
//
//		System.out.println("Flying...");
//		
//	}

	@Override
	public void move() {
		System.out.println("Flapping wings...");
	}

}
