class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        //Trie trie = new Trie();
        int longestPrefix = 0;
        HashSet<String> prefixSet = new HashSet<String>();
        
        for(int i = 0; i < arr1.length; i++){
            String currNum = String.valueOf(arr1[i]);
            for(int j = 1; j <= currNum.length(); j++){
                String currPrefix = currNum.substring(0,j);
                prefixSet.add(currPrefix);
            }
        }
        for(int i = 0; i < arr2.length; i++){
            String currNum = String.valueOf(arr2[i]);

            for(int j = 1; j <= currNum.length(); j++){
                String currPrefix = currNum.substring(0,j);
                if(prefixSet.contains(currPrefix) && currPrefix.length() > longestPrefix){
                    longestPrefix = currPrefix.length();
                }
            }
        }

        return longestPrefix;
    }
}