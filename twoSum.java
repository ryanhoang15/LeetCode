class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map_sum = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map_sum.containsKey(difference)){
                return new int[] {map_sum.get(difference), i};
            }
            map_sum.put(nums[i],i);
        }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         int sum = nums[i] + nums[j];
        //         if (sum == target) {
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        return new int[] {0,0};
    }
}
    //     int count = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         if(i < nums.length && nums[count] + nums[i + 1] == target){
    //             return new int [] {i,i+1};
    //         }
    //         count++;
    //     }
    //     return new int[] {0,0};
    // }


    //  for (int i = 0; i < nums.length; i++) {
    //        for (int j = i + 1; j < nums.length; j++) {
    //            int sum = nums[i] + nums[j];
    //            if (sum == target) {
    //                return new int[] {i,j};
    //            }
    //        }
    //    }
    //    return new int[] {0,0};
    // }
