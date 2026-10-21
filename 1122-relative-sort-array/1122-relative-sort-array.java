class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        int[] count = new int[max + 1];
        for(int i = 0; i < arr1.length; i++){
            count[arr1[i]]++;
        }
        int[] ans = new int[arr1.length];
        int j = 0;
        for(int i = 0; i < arr2.length; i++){
            if(j < arr1.length && count[i] >= 0){
                while(count[arr2[i]] > 0){
                    ans[j++] = arr2[i];
                    count[arr2[i]]--;
                }
            }
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0 && j < arr1.length){
                while(count[i] != 0){
                    ans[j++] = i; 
                    count[i]--;
                }
            }
        }
        return ans;
    }
}