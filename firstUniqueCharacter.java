class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            // int count = 1;
            if(map.containsKey(key)){
                int value = map.get(key);
                value++;
                map.put(key,value);
            }
            else{
                map.put(key,count);
            }
        }
        
        for(int j = 0; j < s.length(); j++){
            if(map.get(s.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
    }
}