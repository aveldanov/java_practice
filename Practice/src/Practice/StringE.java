package Practice;

public class StringE {

	public static void main(String[] args) {

		System.out.println(stringG("Heeello"));

	}

	public static boolean stringG(String str) {
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				counter++;
			}
	
		}
		return (counter>=1 && counter<=3);
		



	}

}
