class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Integer indices[]=new Integer[n];
        List<Integer>list=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        for (int i=0;i<n;i++){
            indices[i]=i;
        }
        Arrays.sort(indices, (lhs, rhs) -> Integer.compare(positions[lhs], positions[rhs]));
        for (int currInd:indices){
            if (directions.charAt(currInd)=='R'){
                stack.push(currInd);
            }else{
                while(!stack.isEmpty() && healths[currInd]>0){
                    int topInd=stack.pop();
                    if (healths[currInd]>healths[topInd]){
                        healths[currInd]-=1;
                        healths[topInd]=0;
                    }else if (healths[currInd]<healths[topInd]){
                        healths[currInd]=0;
                        healths[topInd]-=1;
                        stack.push(topInd);
                    }else{
                        healths[currInd]=0;
                        healths[topInd]=0;
                    }
                }
            }
        }
        for (int i:healths){
            if (i>0){
                list.add(i);
            }
        }
        return list;
    }
}
