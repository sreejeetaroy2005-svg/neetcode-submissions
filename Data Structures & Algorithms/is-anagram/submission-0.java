class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {int curr=map.get(s.charAt(i));
            map.remove(s.charAt(i));
            map.put(s.charAt(i),curr+1);}
            else
            map.put(s.charAt(i),1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            if(map2.containsKey(t.charAt(i)))
            {int curr=map2.get(t.charAt(i));
            map2.remove(t.charAt(i));
            map2.put(t.charAt(i),curr+1);}
            else
            map2.put(t.charAt(i),1);
        }
        if(map.equals(map2))
        return true;
        return false;


    }
}
