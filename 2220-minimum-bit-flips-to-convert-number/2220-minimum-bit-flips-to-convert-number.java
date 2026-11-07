class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while(xor > 0){
            int and = xor & 1;
            if(and == 1){
                count++;
            }
            xor >>= 1;
        }
        // return Integer.bitCount(start ^ goal);
        return count;
    }
}