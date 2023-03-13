class Solution
{
    public int find_median(int[] v)
    {
         Arrays.sort(v);
        int n = v.length;
        if(n%2 != 0) return v[n/2];
        
            int n1 = n/2;
            
    return (v[n1]+v[n1-1])/2;
    }
}

{https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty[]=-2&sortBy=submissions}
