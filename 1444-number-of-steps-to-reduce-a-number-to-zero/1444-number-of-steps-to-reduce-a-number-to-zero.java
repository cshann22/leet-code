class Solution {
    public int numberOfSteps(int num) {
        int numSteps = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                numSteps++;
            }
            else{
                num -= 1;
                numSteps++;
            }
        }
        return numSteps;
    }
}