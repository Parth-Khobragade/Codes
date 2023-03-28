class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
}

{https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions}
