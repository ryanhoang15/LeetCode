class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        int remainder = 0;
        int num = x;
        while(num > 0){
            remainder = num % 10;
            sum = sum * 10 + remainder;
            num = num / 10; 
        }
        
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
}