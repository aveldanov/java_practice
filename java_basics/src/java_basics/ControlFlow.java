package java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		//		boolean hungry = false;
		//
		//		if(!hungry) {
		//			System.out.println("Im starving...");
		//
		//		}else {
		//
		//			System.out.println("Im not hungry");
		//
		//		}


		//
		//		int hungerRating = 5;
		//		if(!(hungerRating<6)) {
		//			System.out.println("Im not hungry");
		//		}else {
		//
		//
		//			System.out.println("Im starving");
		//
		//		}

		//		int favoriteTemp = 75;
		//		int currentTemp = 95;
		//		String opinion;
		//		
		//		if(currentTemp < favoriteTemp-30) {
		//			opinion = "It is cold";
		//		}else if(currentTemp<favoriteTemp-20){
		//			opinion = "It is chill";
		//			
		//		}else if(currentTemp>favoriteTemp+10) {
		//			
		//			opinion ="It is hot";
		//		}else {
		//			opinion = "It is OK";
		//		}
		//		
		//		System.out.println(opinion);



		int month = 2;
		String monthString;

		switch(month) {
		case 1: monthString = "January";
		break;
		case 2: monthString = "Feb";
		break;
		case 3: monthString = "March";
		break;
		case 6: monthString = "June";
		break;

		default: monthString = "unknown";
		break;


		}
		System.out.println(monthString);






	}
}