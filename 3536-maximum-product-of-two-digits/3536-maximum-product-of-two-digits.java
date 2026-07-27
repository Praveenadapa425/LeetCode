class Solution {
    public int maxProduct(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        while(n > 0){
            int x = n %10;
            map.put(x , map.getOrDefault(x,0)+1);
            n /= 10;
        }

        int n1= 0,n2=0;
        for(int i =9;i>=0;i--){
            if(map.containsKey(i)){
                
                if(map.get(i) >= 2 || n1 != 0){
                    n2 = i;
                }
                if(n1 == 0){
                    n1 = i;
                }
                if(n1 != 0 && n2 != 0) break;
            }
        }

        return n1 * n2;

    }
}