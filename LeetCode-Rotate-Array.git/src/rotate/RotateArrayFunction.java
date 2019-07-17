package rotate;

import java.util.Arrays;

public class RotateArrayFunction {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        // reverse "----->-->" will be "<--<-----"
        reverse(nums, 0, nums.length - 1);
        
        System.out.println("first reverse: " + Arrays.toString(nums));
        
        // reverse "<--" will be "--><-----"
        reverse(nums, 0, k - 1);
        
        System.out.println("second reverse: " + Arrays.toString(nums));
        
        // reverse "<-----" we can get "-->----->"
        reverse(nums, k, nums.length - 1);
        
        System.out.println("Solution: " + Arrays.toString(nums));
    }
    
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            
            nums[start] = nums[end];
            
            nums[end] = temp;
            
            start++;
            
            end--;
        }
    }
}
