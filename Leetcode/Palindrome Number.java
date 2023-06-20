class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || x%10==0){
         return false;
        }

        int reverse=0;
        int temp=x;
        while(x!=0){
            int lastdigit=x%10;
            reverse=reverse*10+lastdigit;
            x=x/10;

            if(reverse==temp){
                return true;
            }
            
        }
        return false;
    }
}

//https://leetcode.com/problems/palindrome-number/description/
