class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String number = "1234567890";
        int start = String.valueOf(low).length();
        int end = String.valueOf(high).length();

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = start ; i<=end ; i++){
            for(int j = 0,k=i;k<number.length() ; j++,k++){

                int n = Integer.parseInt(number.substring(j,k));
                if(n >=low && n <= high) ans.add(n);
            }
        }
        return ans;
    }
}