class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String number = "1234567890";
        int start = String.valueOf(low).length();
        int end = String.valueOf(high).length();

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = start ; i<=end ; i++){
            for(int j = i;j<number.length() ; j++){

                int n = Integer.parseInt(number.substring(j-i,j));
                if(n >=low && n <= high) ans.add(n);
            }
        }
        return ans;
    }
}