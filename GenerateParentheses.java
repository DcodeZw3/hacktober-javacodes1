class Solution {
    List<String> ans = new ArrayList<>();
    public void helper(String s, int open, int close, int n)
    {
        if(s.length()==2*n)
        {
            ans.add(s);
            return;
        }
        if(open<n)
        {
            helper(s+'(', open+1,close,n);
        }
        if(close<open)
        {
            helper(s+')', open, close+1, n);
        }
    }
    
    public List<String> generateParenthesis(int n) {
        if(n==0)
        return ans;
        helper("",0,0,n);
        return ans;
    }
}
