class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                return i;
            }
            
        }
        return -1;
    }
}

{https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&curated[]=1&sortBy=submissions}
