class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSub(nums,goal)-countSub(nums,goal-1);
        
    }

    private int countSub(int[] nums, int goal) {
        if(goal<0) return 0;
        int l=0;
        int sum=0;
        int count=0;

        for (int r = 0; r < nums.length; r++){
            sum +=nums[r];

            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}