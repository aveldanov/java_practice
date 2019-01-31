package objects;

public class Fish extends Animal {

	public Fish(String animal, int age, int weight, String food) {
		super(animal, age, weight, food);
		// TODO Auto-generated constructor stub
	}

	public void swim() {

		System.out.println("Swimming...");

	}

	@Override
	public void move() {
		System.out.println("Fish is swimming");
	}

}
