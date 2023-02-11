class Solution{
    static long nPr(long n, long r){
        // code here
        return fact(n)/fact(n-r);
    }
    
     static long fact(long n){
         long fact=1;
         for (long i=1;i<=n;i++){
             fact=fact*i;
         }
         return fact;
     }
}


{https://practice.geeksforgeeks.org/problems/npr4253/0}
