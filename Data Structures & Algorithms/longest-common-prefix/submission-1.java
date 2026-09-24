class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        int i=0;
        while(i<strs[0].length())
        {
               char curr=strs[0].charAt(i);
               int flag=0;
               for(int j=1;j<strs.length;j++)
               {
                if(strs[j].charAt(i)==curr)
                continue;
                else
                {flag=1;
                break;}
               }
               if(flag==0)
               {i++;sb.append(curr);}
               else
               break;

        }
        return sb.toString();
        
    }
}