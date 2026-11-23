class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        while(k > 0){
            min += 1;
            if(min > max || min == max){
                if((max - min) < 0 ){
                    return 0;
                }else {
                    return max - min;
                }
            }
            max -= 1;
            k--;
        }
        return max - min;
    }
}