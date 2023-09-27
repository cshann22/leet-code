class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = 0;
        int n = s.length();
        int j = n - 1;
        while(i < n){
            if(s.charAt(i) == ' '){
                i++;
            }
            else break;
        }
        while(j >= 0){
            if(s.charAt(j) == ' '){
                j--;
            }
            else break;
        }

        String[] string = s.substring(i, j+1).split(" ");
        return string[string.length-1].length();
    }
}