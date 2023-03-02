
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++){
                      int b=0;
                      int temp=a[i];
                     
                          while(temp>0){
                            int digit=temp%10;
                            b=(b*10)+digit;
                            temp=temp/10;
                          }
                          if(b!=a[i]){
                              return 0;
                          }
                      }
                  
                  return 1;
                  
                  
           }
}

{https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&sortBy=submissions}
