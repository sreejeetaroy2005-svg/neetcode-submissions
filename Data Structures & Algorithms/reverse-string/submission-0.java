class Solution {
    public void reverseString(char[] s) 
    {
        int start=0;
        int last=s.length-1;
        while(start<last)
        {
            char curr=s[start];
            s[start]=s[last];
            s[last]=curr;
            start++;last--;
        }
        
    }
}