class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        List<Character>res=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='('){
                stack.add(res.size());
            }else if (ch==')'){
                reverse(res,stack.pop(),res.size()-1);
            }else {
                res.add(ch);
            }
        }
        String ans="";
        for (int i=0;i<res.size();i++){
            ans+=res.get(i);
        }
        return ans;

    }
    private static void reverse(List<Character>list,int i,int j){
        while(i<=j){
           char temp=list.get(i);
           list.set(i,list.get(j));
           list.set(j,temp);
           i++;
           j--;
        }
    }
}