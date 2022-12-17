class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecOnes =0;
        int max =0;
        for(int i=0; i< nums.length; i++){
            if (nums[i]==1)
                consecOnes++;
                if (consecOnes > max)
                    max = consecOnes;
            else if (nums[i] ==0)
                consecOnes =0;
            
        }
        return max;
    }
    
}
