class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length() , m=s2.length();
        if(m < n) return false;

        int[] freq = new int[26];
        int[] freq1 = new int[26];

        for(int i=0;i<n;i++){
            freq[s1.charAt(i) - 'a']++;
            freq1[s2.charAt(i)- 'a']++;
        }

        for(int i=n ;i<m;i++){
           if(Arrays.equals(freq , freq1)){
             return true;
           }
           freq1[s2.charAt(i) - 'a']++;
           freq1[s2.charAt(i - n) - 'a']--;
        }
        return Arrays.equals(freq , freq1);
        
    }
}
