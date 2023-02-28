class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp=n;
        int armstrong=0;
        while(n>0){
            int remainder=n%10;
            armstrong=(remainder*remainder*remainder)+armstrong;
            n=n/10;
            
        }
        
       return armstrong==temp?"Yes":"No";
    }
}

{https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1?page=1&difficulty[]=-2&sortBy=submissions}
