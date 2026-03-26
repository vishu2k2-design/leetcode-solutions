class Solution {
    public int firstMissingPositive(int[] num) {
        int n=num.length;
        for(int i =0; i<n ;i++){
            while(num[i]>0 && num[i]<=n && num[num[i]-1]!=num[i]){
                int corrInd=num[i]-1;
                int temp=num[i];
                num[i]=num[corrInd];
                num[corrInd]=temp;
            }
        }
        for(int i =0; i<n ;i++){
            if(num[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}