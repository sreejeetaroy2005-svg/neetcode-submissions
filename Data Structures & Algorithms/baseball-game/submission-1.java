class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            char c=s.charAt(0);
            if(c=='+')
            {
                int a=stck.pop();
                int b=stck.pop();
                int p=a+b;
                stck.push(b);
                stck.push(a);
                stck.push(p);
                continue;

            }
            if(c=='C')
            {stck.pop();continue;}
            if(c=='D')
            {
                int x=stck.pop();
                stck.push(x);
                stck.push(2*x);
                continue;

            }
            stck.push(Integer.parseInt(s));
            
        }
        int sum=0;
        while(!stck.isEmpty())
        {
            sum=sum+stck.pop();
        }
        return sum;
    }
}