class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int bCount = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<j){
            if(people[i]+people[j] <= limit){ //two people in one boat
                bCount++;
                i++;
                j--;
            }else{
                bCount++; //else limit exceeds send large one in boat
                j--;
            }
        }
        if(i==j){
            bCount++; //if one person remains
        }
        return bCount;
    }
}