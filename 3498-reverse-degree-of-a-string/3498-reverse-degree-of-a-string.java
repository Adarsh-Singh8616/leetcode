class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int mul = 1;
            int a = 26 - (s.charAt(i) - 'a');
            mul = a*(i+1);
            sum += mul;
        }   
        return sum;
    }
}