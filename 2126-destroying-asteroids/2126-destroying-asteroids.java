class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long presentMass  = mass;
        for(int i:asteroids){
            if(presentMass < i) return false;
            presentMass += i;
        }
        return true;
    }
}