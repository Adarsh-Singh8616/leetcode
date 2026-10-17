class Solution {
    public int minElement(int[] nums) {
        int arr[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            int num = nums[i];
            while(num > 0){
                int rem = num % 10;
                sum += rem;
                num = num / 10;
            }
            min = Math.min(min, sum);
        }
        return min;
        
    }
}