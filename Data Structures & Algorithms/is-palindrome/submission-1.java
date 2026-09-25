class Solution {
    public boolean isPalindrome(String s) 
    {
        int start=0;
        int last=s.length()-1;
        while(start<last)
        { 
            if(!Character.isLetterOrDigit(s.charAt(start)))
            {start++;continue;}
            if(!Character.isLetterOrDigit(s.charAt(last)))
            {last--;continue;}
            if(((Character.toLowerCase(s.charAt(start)))==(Character.toLowerCase(s.charAt(last)))))
            {
                start++;last--;
            }
            else
            return false;
        }
        return true;

        
    }
}
