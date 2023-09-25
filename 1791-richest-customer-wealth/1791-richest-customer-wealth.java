class Solution {
    public int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int width = accounts[0].length;

        int richest = 0;
        for(int i = 0; i < length; i++){
            int current = 0;
            for(int j = 0; j < width; j++){
                current += accounts[i][j];
            }
            richest = Math.max(richest, current);
        }

        return richest;
    }
}