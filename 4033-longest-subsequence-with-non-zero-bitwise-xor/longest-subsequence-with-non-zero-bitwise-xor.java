class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int zeroes=0;
        for(int num:nums){
            xor^=num;
        if(num==0){
            zeroes++;
        }
    }
    int n=nums.length;
    if(xor!=0){
        return n;
    }
    if(zeroes==n){
        return 0;
    }
    return n-1;
}
}