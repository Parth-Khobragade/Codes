class Solution
{
    public long[] find(int l, int b, int h)
    {
        // code here
    long L=l,W=b,H=h,i=(int)2;
    long arr[] = new long[2];
    
    arr[0] = i*((W*H)+(H*L)+(L*W));
    arr[1] = L*W*H;
    
    return arr;
    }
}

{https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid0522/1?page=6&difficulty[]=-2&sortBy=submissions}
