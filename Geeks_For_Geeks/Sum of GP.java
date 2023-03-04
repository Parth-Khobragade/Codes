
class Solution
{
    public long sum_of_gp(long n, long a, long r)
    {
        // Code here
        
        
        long sum=a;
        for(int i=1; i<n; i++){
            a=a*r;
            sum+=a;
        }
        return sum;
        
    }
}
