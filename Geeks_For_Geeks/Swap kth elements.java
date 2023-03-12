class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int temp;
        temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
    }

}

{https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&difficulty[]=-2&sortBy=submissions}
