class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < numbers.length; index++){
            int difference = target - numbers[index];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference) + 1,index + 1};
            }
            map.put(numbers[index], index);
        }
        // int a_pointer = 0;
        // int b_pointer = numbers.length - 1;
        // while(a_pointer < b_pointer){
        //     int sum = numbers[a_pointer] + numbers[b_pointer];
        //     if(sum > target){
        //         b_pointer--;
        //     }
        //     else if(sum < target){
        //         a_pointer++;
        //     }
        //     else{
        //         return new int[] {a_pointer+1, b_pointer+1};
        //     }
        // }
        // for(int i = 0; i < numbers.length; i++){
        //     for(int j = i + 1; j < numbers.length; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             return new int[] {i+1,j+1};
        //         }
        //     }
        // }
        return new int [] {0,0};
        
    }
}