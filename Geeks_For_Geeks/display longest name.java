class GFG {
    String longest(String names[], int n) {
    int index=0;
    String e=names[0];
    for(int i=1;i<n;i++)
    {
        String e1=names[i];
        if(e1.length()>e.length())
        {
            index=i;
            e=e1;
        }
    }
    return e;    
    
    }
}
