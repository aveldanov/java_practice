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
		
	}
}
