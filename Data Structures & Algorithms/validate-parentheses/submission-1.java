class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stck = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '[')
            {
                stck.push(c);
            }
            else if(c == ')')
            {
                if(stck.isEmpty() || stck.pop() != '(')
                    return false;
            }
            else if(c == '}')
            {
                if(stck.isEmpty() || stck.pop() != '{')
                    return false;
            }
            else if(c == ']')
            {
                if(stck.isEmpty() || stck.pop() != '[')
                    return false;
            }
        }

        return stck.isEmpty();
    }
}