class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int num = i;
            int val = i;
            while(val > 0){
                int rem = val % 10;
                if(rem == 0 || num % rem != 0){
                    break;
                }
                val /= 10;
                if(val == 0){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}