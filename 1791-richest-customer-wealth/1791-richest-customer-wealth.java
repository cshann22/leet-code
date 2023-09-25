class Solution {
    public int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int width = accounts[0].length;

        int richest = 0;
        int current = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                current += accounts[i][j];
            }
            if(current > richest){
                richest = current;
            }
            current = 0;
        }

        return richest;
    }
}