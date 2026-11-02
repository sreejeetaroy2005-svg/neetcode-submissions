class Solution {
    public int evalRPN(String[] tokens) 
    {
          int i=0;
          Stack<Integer> stck=new Stack<>();
          while(i<tokens.length)
          {
            String curr=tokens[i];
            if(curr.equals("+")||(curr.equals("-"))||(curr.equals("/"))||(curr.equals("*")))
            {
               int a=stck.pop();
               int b=stck.pop();
               if(curr.equals("+"))
               stck.push(a+b);
               if(curr.equals("-"))
               stck.push(b-a);
               if(curr.equals("/"))
               stck.push(b/a);
               if(curr.equals("*"))
               stck.push(a*b);
               i++;
            }
            else
            {
                stck.push(Integer.parseInt(curr));
                i++;
            }
            
          }
          return stck.peek();
        
    }
}
