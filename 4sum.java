class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); 
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                twoSum(i, j, (long)target, nums, list);
            }
        }
        return list;
    }
    public void twoSum(int i, int j, long target, int[] nums, List<List<Integer>> list){
        long modifiedTarget = target - (nums[i] + nums[j]);
        int left = j + 1, right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == modifiedTarget){
                list.add(Arrays.asList(
                    nums[i], nums[j], nums[left], nums[right]));
                left++; right--;
                while(left < right && nums[left] == nums[left - 1]) left++;
                while(left < right && nums[right] == nums[right + 1]) right--;
            }
            else if(sum > modifiedTarget) right--;
            else left++;
        }
    }
}
