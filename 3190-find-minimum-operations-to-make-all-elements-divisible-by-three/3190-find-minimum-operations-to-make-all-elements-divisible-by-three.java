class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int num : nums){
            if(num % 3 != 0){
                if(num % 3 < 3){
                    op += 1;
                }else{
                    int a = num % 3;
                    op += a;
                }
            }
        }
        return op;
        
    }
}