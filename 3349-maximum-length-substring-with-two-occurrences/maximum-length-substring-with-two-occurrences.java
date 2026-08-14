class Solution {
    public int maximumLengthSubstring(String s) {
       int[] count=new int[26];
       int left=0;
       int maxL=0;
       for(int r=0;r<s.length();r++){
        count[s.charAt(r)-'a']++;
        while(count[s.charAt(r)-'a']>2){
            count[s.charAt(left)-'a']--;
            left++;
        }
        maxL=Math.max(maxL,r-left+1);
       } 
       return maxL;
    }
}