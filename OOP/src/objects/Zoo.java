package objects;

public class Zoo {
	
	public static void main(String args[]) {
		
		Animal animal1 = new Animal("Tiger", 25,100,"Yogurt");
		Animal animal2 = new Animal("Giraffe",10,200,"leaves");
		
		animal1.eat();
		animal2.eat();

		
		Bird bird1 = new Bird();
		bird1.fly();
		
		
	}
	
	
	

}
