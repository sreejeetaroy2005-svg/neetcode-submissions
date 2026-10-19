class Solution 
{
    public String longestPalindrome(String s) 
    {
        String ss="";
        int max=-1;
        for(int i=0;i<s.length();i++)//considering centre
        {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            int left=i-1;
            int right=i+1;
            while((left>=0)&&(right<=s.length()-1)&&(s.charAt(left)==s.charAt(right)))
            {
                sb.append(s.charAt(right));
                sb.insert(0,s.charAt(left));
                left--;
                right++;

            }
            if(sb.length()>max)
             {max=sb.length();
             ss=sb.toString();}
        }
        for (int i = 0; i < s.length() - 1; i++) 
        {
        StringBuilder sb2 = new StringBuilder();
        int left = i;
         int right = i + 1;
          while (left >= 0 && right < s.length()&& s.charAt(left) == s.charAt(right)) 
        {

        sb2.append(s.charAt(right));
        sb2.insert(0, s.charAt(left));

        left--;
        right++;
    }

    if (sb2.length() > max) {
        max = sb2.length();
        ss = sb2.toString();
    }
}
return ss;

        
    }
}
