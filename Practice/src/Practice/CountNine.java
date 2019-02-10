package Practice;

public class CountNine {

	public static void main(String[] args) {
		int[] arr= {1,2,3,9,5,5};
		System.out.println(arrayCount9(arr));
	}
	
	public static  int arrayCount9(int nums[]) {
		 int counter = 0;

		  for (int i=0;i<nums.length; i++){

		    if(nums[i]==9){
		      counter++;
		    }

		    
		  }
		  return counter;
		
	}

}
