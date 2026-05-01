class Solution {
    public int thirdMax(int[] nums) {

        Long f=null;
        Long s=null;
        Long t=null;

        for(int num:nums){
            long n=num;

            if((f !=null && n==f) || (s !=null && n==s) || (t !=null && n==t)){
                continue;
            }
            if(f ==null ||n>f){
                t=s;
                s=f;
                f=n;
            }else if(s==null ||n>s){
                t=s;
                s=n;
            }else if(t==null ||n>t){
                t=n;
            }
        }
        return t==null ?f.intValue() : t.intValue();

        
    }
}