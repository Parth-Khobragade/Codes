class Solution {
    public int search(int arr[], int n, int k) {

        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i+1;
            }
        }
        return -1;
    }
}

{https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty[]=-1&sortBy=submissions}
