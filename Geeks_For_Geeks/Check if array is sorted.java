class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
       
         
         if(n == 1 || n == 0) return true;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1] )
            return false;
        }
        return true;
        
        
    }
}

{https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/0}
