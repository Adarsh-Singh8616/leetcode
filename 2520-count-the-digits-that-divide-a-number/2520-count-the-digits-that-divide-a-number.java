class Solution {
    public int countDigits(int num) {
        if(num < 10){
            return 1;
        }
        int origin = num;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(origin % rem == 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}