package rotate;

import java.util.Arrays;

public class RotateArrayFunction {
    public static void rotate(int[] nums, int k) {
    	// The reason why we should mod because each element 
        k = k % nums.length;
        
        // reverse "----->-->" will be "<--<-----"
        // First reverse the array
        reverse(nums, 0, nums.length - 1);
        
        System.out.println("first reverse: " + Arrays.toString(nums));
        
        // reverse "<--" will be "--><-----"
        // Then swap left and right within the 0 to k - 1 index
        reverse(nums, 0, k - 1);
        
        System.out.println("second reverse: " + Arrays.toString(nums));
        
        // reverse "<-----" we can get "-->----->"
        // Then reverse back the element after k
        reverse(nums, k, nums.length - 1);
        
        System.out.println("Solution: " + Arrays.toString(nums));
    }
    
    // Simple reverse method
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
}
