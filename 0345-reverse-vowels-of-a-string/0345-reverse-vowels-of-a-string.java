class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            if("aeiouAEIOU".indexOf(arr[first]) == -1){
                first++;
            }else if("aeiouAEIOU".indexOf(arr[last]) == -1){
                last--;
            }else{
                char temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;

                last--;
                first++;
            }
        }
        return new String(arr);
    }
}