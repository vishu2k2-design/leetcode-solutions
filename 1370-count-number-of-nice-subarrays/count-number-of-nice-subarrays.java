class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int c=0,s=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<nums.length;i++){
            s += nums[i]%2;
            if(s==k)c++;
            if(map.containsKey(s-k))
            c +=map.get(s-k);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
        
    }
}