class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int count = 1;
        while(candies > 0){
            for(int i = 0; i < arr.length; i++){
                if(candies <= count){
                    arr[i] += candies;
                    return arr;
                }
                arr[i] += count;
                candies -= count;
                count++;
            }
        }
        return arr;
    }
}