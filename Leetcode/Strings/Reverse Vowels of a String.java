class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int start=0;
        int end=n-1;
        while(start<=end){
            if(!isvowel(ch[start])){
                start++;
            }
            else if(!isvowel(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]= temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
     
    //function to check weather char is vowel or not  
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}
