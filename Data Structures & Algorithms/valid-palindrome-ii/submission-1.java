class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int flag = 0;
        int start = 0;
        int last = s.length() - 1;

        while(start < last)
        {
            if(!Character.isLetterOrDigit(s.charAt(start)))
            {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(last)))
            {
                last--;
                continue;
            }

            char ss = s.charAt(start);
            char l = s.charAt(last);

            if(Character.toLowerCase(ss) == Character.toLowerCase(l))
            {
                start++;
                last--;
                continue;
            }
            else
            {
                if(flag == 0)
                {
                    return func(s, start + 1, last) ||
                           func(s, start, last - 1);
                }
                else
                    return false;
            }
        }

        return true;
    }

    public boolean func(String s, int start, int last)
    {
        while(start < last)
        {
            if(Character.toLowerCase(s.charAt(start)) !=
               Character.toLowerCase(s.charAt(last)))
            {
                return false;
            }

            start++;
            last--;
        }

        return true;
    }
}