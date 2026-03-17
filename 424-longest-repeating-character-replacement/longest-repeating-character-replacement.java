class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int l=0;
        int maxL=0;
        int maxF=0;

        for(int r=0 ;r<s.length() ;r++){
            char ch =s.charAt(r);
            freq[ch-'A']++;
            maxF=Math.max(maxF,freq[ch-'A']);

            while((r-l+1)-maxF>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxL=Math.max(maxL,r-l+1);
        }
        return maxL;
        
    }
}