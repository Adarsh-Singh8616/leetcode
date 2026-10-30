class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int j = 0;
        while(n >= 0){
            for(int i = 1; i <= 7; i++){//1,2,3,4,5,6,7
                sum += i + j; 
                n--;
                if(n == 0){
                    return sum;
                }
            }
            j++;
        }
        return sum;
    }
}