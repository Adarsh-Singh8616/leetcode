class Solution {
    public int passThePillow(int n, int time) {
        int s = time / (n-1);
        time = time % (n - 1);

        if(s % 2 == 0){
            return time + 1;
        }else{
            return n - time;
        }

    }
}