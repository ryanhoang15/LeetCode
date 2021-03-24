import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        char[] copy = new char[s.length];
        int count = 0;
        char temp = 'a';
        
        for(int j = 0; j < s.length; j++){
            copy[j] = s[j];
        }
        
        for(int i = s.length - 1; i >= 0; i--){
            temp = copy[i];
            s[count] = temp;
            count++;
        }
    }
}
