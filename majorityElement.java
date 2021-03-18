class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int maxCount = 0;
        // int maj = 0;
        for(int i = 0; i < len; i++){
            int count = 0;
            for(int j = i + 1; j < len; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            
            if(count > maxCount && count >= len/2){
                maxCount = i;
                // maj = nums[i];
            }
        }
        // return maj; 
        return nums[maxCount];
    }
}