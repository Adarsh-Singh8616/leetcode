class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int start = 0;
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                idx = i;
                break;
            }
        }
        while(start <= idx){
            char temp = arr[start];
            arr[start] = arr[idx];
            arr[idx] = temp;
            start++;
            idx--;
        }
        return new String(arr);
        
    }
}