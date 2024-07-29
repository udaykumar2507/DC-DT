class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int cnt=0;
        for (int i=1;i<rating.length-1;i++){
            int largerleft=0;
            int smallerleft=0;
            int largerright=0;
            int smallerright=0;
            for (int j=i-1;j>=0;j--){
                if (rating[j]>rating[i]){
                    largerleft++;
                }
                if (rating[j]<rating[i]){
                    smallerleft++;
                }
            }
            for (int k=i+1;k<n;k++){
                if (rating[k]<rating[i]){
                    smallerright++;
                }
                if (rating[k]>rating[i]){
                    largerright++;
                }
            }
            cnt+=smallerleft*largerright;
            cnt+=smallerright*largerleft;
        }
        return cnt;
    }
}
