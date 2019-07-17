package rotate;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		// Input
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		// Making a rotateArrayfunction object
		RotateArrayFunction solution = new RotateArrayFunction();
		
		solution.rotate(nums, k);
	}

}
