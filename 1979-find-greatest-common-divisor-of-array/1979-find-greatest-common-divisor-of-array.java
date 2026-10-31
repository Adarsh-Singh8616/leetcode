class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int sum = 0;
        for(int i = 2; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                sum = i;
            } 
        }
        if(sum != 0){
            return sum;
        }
        return 1;
    }
}