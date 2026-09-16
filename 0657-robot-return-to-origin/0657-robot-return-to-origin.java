class Solution {
    public boolean judgeCircle(String moves) {
        int L = 0;
        int U = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                L++;
            }else if(moves.charAt(i) == 'R'){
                L--;
            }else if(moves.charAt(i) == 'U'){
                U++;
            }else{
                U--;
            }

        }
        if((L == 0) && (U == 0)){
            return true;
        }
        return false;
    }
}