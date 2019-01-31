package objects;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String animal, int age, int weight, String food) {
		super(animal, age, weight, food);

	
	}

	@Override
	public void fly() {
		System.out.println("Sparrow can fly...");
	}

}
