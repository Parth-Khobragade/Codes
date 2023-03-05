class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         int sum1=0;
         for(int i=0;i<A.length;i++){
             sum1=sum1+A[i];
         }
         
         int sum2=0;
         for(int j=1;j<=N;j++){
             sum2=sum2+j;
         }
         
         return sum2-sum1;
    }
}

{https://practice.geeksforgeeks.org/problems/missing-number4257/1?page=5&difficulty[]=-1&sortBy=submissions}
