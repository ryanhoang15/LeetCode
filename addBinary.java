class Solution {
    public String addBinary(String a, String b) {
        String wrd = " ";
        String revWrd = " ";
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int sum = 0;
        int carry = 0;
        
        while(lenA >= 0 || lenB >= 0){
            
            if(lenA >= 0){
                sum = sum + a.charAt(lenA) - '0';
            }
            
            if(lenB >= 0){
                sum = sum + b.charAt(lenB) - '0';
            }
            
            if(sum % 2 == 0){
                wrd = wrd + "0";
            }
            else{
                wrd = wrd + "1";
            }
            carry = sum / 2;
            sum = carry;
            lenA--;
            lenB--;
        }
        if(carry != 0){
            wrd = wrd + "1";
        }
        for(int i = wrd.length() - 1; i >= 0; i--){
            revWrd = revWrd + wrd.charAt(i);
            
        }
        return revWrd.trim();
    }
}