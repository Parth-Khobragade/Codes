class Solution {
    public int reverse(int x) {
        int temp; 
        long reverse = 0; 
        
        while(x!=0){
            temp = x % 10; 
            reverse = reverse * 10 + temp; 
            x = x/10; 
        }
        if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE)
            return (int)reverse; 
         else
             return 0; 
    }    
}

//https://leetcode.com/problems/reverse-integer/description/
