class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int maxL=0;
        int zeroC=0;

        for(int i=0 ;i<nums.length ;i++){
            if(nums[i]==0){
                zeroC++;
            }
            while(zeroC>k){
                if(nums[l]==0){
                    zeroC--;
                }
                l++;
            }
            maxL =Math.max(maxL,i-l+1);
        }
        return maxL;
        
    }
}