class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        long count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count=count+1;
            }
        }
        return count;
        
    }
}

{https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=1&difficulty[]=-2&sortBy=submissions}
