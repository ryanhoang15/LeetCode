class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        
//         if(s.equals(" ")){
//             return 0;
//         }
        
        // int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
            
        }
        return count;
    }
}