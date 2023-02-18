class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long product=1;
        for(int i=0;i<n;i++){
            product=(product*arr[i])%mod;
        }
        return product;
        
    }
}

{https://practice.geeksforgeeks.org/problems/product-of-array-element/1?page=2&difficulty[]=-1&category[]=Arrays&sortBy=submissions}
