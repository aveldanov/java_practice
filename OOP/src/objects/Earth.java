package objects;

public class Earth {
	public static void main(String args[]) {
		
		
		Human tom;
		
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "blue";
		tom.heightInInches = 72;
		tom.name = "Tom Veldanov";
		
		tom.speak();
		
		
		
		Human joe;
		joe = new Human();
		joe.age = 5;
		joe.name = "Joe Veldanov";
		joe.heightInInches = 70;
		joe.eyeColor = "Red";
		
		joe.speak();
	}
}
