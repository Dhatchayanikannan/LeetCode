class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            int add=0;
            for(int j=i+1;j<nums.length;j++)
            {
                add=nums[i]+nums[j];
                if(add==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
