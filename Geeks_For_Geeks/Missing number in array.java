class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum1=0;
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i];
        }
        
        int sum2=0;
        for(int j=1;j<=n;j++){
            sum2=sum2+j;
        }
        return sum2-sum1;
    }
}

{https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions}
