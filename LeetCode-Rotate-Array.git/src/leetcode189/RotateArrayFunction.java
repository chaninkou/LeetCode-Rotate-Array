package leetcode189;

import java.util.Arrays;

public class RotateArrayFunction {
    public static void rotate(int[] nums, int k) {
    	// The reason why we should mod because each element 
        k = k % nums.length;
        
        // reverse "----->-->" will be "<--<-----"
        // First reverse the array
        reverse(nums, 0, nums.length - 1);
        
        System.out.println("first reverse: " + Arrays.toString(nums));
        
        // reverse the elements before k
        // Then swap left and right within the 0 to k - 1 index
        reverse(nums, 0, k - 1);
        
        System.out.println("second reverse: " + Arrays.toString(nums));
        
        // reverse the elements after k
        // Then reverse back the element after k
        reverse(nums, k, nums.length - 1);
        
        System.out.println("Solution: " + Arrays.toString(nums));
    }
    
    // Reverse helper method
    public static void reverse(int[] nums, int start, int end){
    	// Swap beginning and end element
        while(start < end){
            int temp = nums[start];
            
            nums[start] = nums[end];
            
            nums[end] = temp;
            
            start++;
            
            end--;
        }
    }
    
    // Brute force solution: O(n * k) time, O(1) space, not using any extra space
    public void rotate2(int[] nums, int k) {
        int temp;
        int previous;
        
        for (int i = 0; i < k; i++) {
        	// Keep rotating the last element to the front 
            previous = nums[nums.length - 1];
            
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    
    // Using extra space solution
    public void rotate3(int[] nums, int k){
    	int[] temp = new int[nums.length];
    	
    	// using mod and
    	for(int i = 0; i < nums.length; i++){
    		temp[(i + k) % nums.length] = nums[i];
    	}
    	
    	for(int j = 0; j < nums.length; j++){
    		nums[j] = temp[j];
    	}
    }
    
    
}
