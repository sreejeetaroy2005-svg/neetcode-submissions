class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        int l=0;
        int r=0;
        int s[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            s[s1.charAt(i)-'a']=s[s1.charAt(i)-'a']+1;
        }
        int scheck[]=new int[26];
        scheck[s2.charAt(0)-'a']=1;
        while(r<s2.length())
        {
            if(Arrays.equals(scheck,s))
            return true;
            r++; if(r>=s2.length())
                break;
            scheck[s2.charAt(r)-'a']=scheck[s2.charAt(r)-'a']+1;
            if(r-l+1>s1.length())
            {
                scheck[s2.charAt(l) - 'a']--;
                l++;
            }

        }
        return false;
        
    }
}
