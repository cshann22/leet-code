class Solution {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < n; i++){
            if((i+1) % 5 == 0 && (i+1) % 3 == 0){
                list.add("FizzBuzz");
            }
            else if((i+1) % 3 == 0){
                list.add("Fizz");
            }
            else if((i+1) % 5 == 0){
                list.add("Buzz");
            }
            else{
                String t = "";
                t += i + 1;
                list.add(t);
            }
        }
        return list;
    }
}