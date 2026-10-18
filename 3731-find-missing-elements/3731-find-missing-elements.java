class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        Arrays.sort(nums);

        int j = 0;
        for(int i = min; i <= max; i++){
            if(j < nums.length && nums[j] == i){
                j++;
            }else{
                arr.add(i);
            }
        }
        return arr;
    }
}