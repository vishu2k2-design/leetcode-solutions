class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character ,Character> inputt= new HashMap<>();

        for(int i=0;i<s.length();i++){

            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(inputt.containsKey(c1)){
                if(inputt.get(c1)!=c2){
                    return false;

                }
               
                    }
                     else{
                    if(inputt.containsValue(c2)){
                        return false;
                   
                }
                 inputt.put(c1,c2);
            }

        }
        return true;
    }
}