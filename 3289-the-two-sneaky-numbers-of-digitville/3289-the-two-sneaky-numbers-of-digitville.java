class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int[] count = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            count[nums[i]]++;
        }
        int c = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] >= 2){
                arr[c] = i;
                c++;
            }
        }
        return arr;
    }
}