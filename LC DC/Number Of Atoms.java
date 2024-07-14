class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String,Integer>>stack=new Stack<>();
        stack.push(new HashMap<>());
        int i=0;
        int n=formula.length();
        while(i<n){
            if (formula.charAt(i)=='('){
                stack.push(new HashMap<>());
                i++;
            }else if (formula.charAt(i)==')'){
                Map<String,Integer>top=stack.pop();
                i++;
                int start=i;
                while(i<n && Character.isDigit(formula.charAt(i)))i++;
                int mult=start<i?Integer.parseInt(formula.substring(start,i)):1;
                for (String key:top.keySet()){
                    stack.peek().put(key,stack.peek().getOrDefault(key,0)+(top.get(key)*mult));
                }
            }else{
                int start=i;
                i++;
                while(i<n && Character.isLowerCase(formula.charAt(i)))i++;
                String s=formula.substring(start,i);
                start=i;
                while(i<n && Character.isDigit(formula.charAt(i)))i++;
                int num=start<i?Integer.parseInt(formula.substring(start,i)):1;
                stack.peek().put(s,stack.peek().getOrDefault(s,0)+num);
            }
        }
        Map<String,Integer>res=stack.pop();
        List<String>list=new ArrayList<>(res.keySet());
        Collections.sort(list);
        String ans="";
        for (i=0;i<list.size();i++){
            ans+=list.get(i);
            if (res.get(list.get(i))>1){
                ans+=(res.get(list.get(i)))+"";
            }
        }
        return ans;

        
    }
}
