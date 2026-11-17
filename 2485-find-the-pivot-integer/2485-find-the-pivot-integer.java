class Solution {
    public int pivotInteger(int n) {
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 1; i <= n; i++){
            sum1 += i;
        }
        int last = n;
        int pivot = -1;
        while(last > 0){
            pivot = last;
            sum2 += last;
            if(sum1 == sum2){
                return pivot;
            }
            sum1 -= last;
            last--;
        }
        return -1;

        
    }
}