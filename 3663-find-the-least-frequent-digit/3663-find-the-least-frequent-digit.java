class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = Integer.toString(n);
        int count[] = new int[10];
        
        for(int i = 0; i < s.length(); i++){
            int j = s.charAt(i)-'0';
            count[j]++;
        }
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i < 10; i++){
            if(count[i] > 0 && count[i] < min){
                min = count[i];
                ans = i;
            }
        }
        return ans;
    }
}