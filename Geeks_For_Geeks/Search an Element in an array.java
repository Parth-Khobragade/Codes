
class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==X){
                return i;
            }
        }
       
        return -1;
     
    }
    
    
}


{https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty[]=-1&sortBy=submissions}
