class Solution {
    public int romanToInt(String s) {
        char[] arr = {'I','V','X','L','C','D','M'};
        int[] nums = {1,5,10,50,100,500,1000};
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int current = 0;
            int next = 0;
            for(int j = 0; j < arr.length; j++){
                if(s.charAt(i) == arr[j]){
                    current = nums[j];
                }
            }
            if(i + 1 < s.length()){
                for(int j = 0; j < arr.length; j++){
                    if(s.charAt(i+1) == arr[j]){
                        next = nums[j];
                    }
                }
            }
            
            if(current < next){
                sum -= current;
            }else{
                sum += current;
            }
        }
        return sum;
    }
}