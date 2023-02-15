class Solution {
    long sumOfSeries(long N) {
        // code here
        long sum = 0;
        for(long i = 1; i<=N; i++){
            sum = sum + (i*i*i);
        }
        return sum;
    }
}

{https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?page=6&difficulty[]=-1&sortBy=submissions}
