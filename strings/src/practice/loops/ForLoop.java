package practice.loops;

public class ForLoop {

	public static void main(String[] args) {
int counter = 0;
		for (int idx = 0; idx < 5; idx++) {
			for(int j=0;j<10;j++) {
				for(int i=0;i<15;i++) {
					
					System.out.println("idx = " + idx +" j =  " + j + "  i = "+ i);

					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
