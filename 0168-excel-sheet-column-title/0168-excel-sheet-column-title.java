class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder c = new StringBuilder();
       while(columnNumber > 0){ 

          columnNumber --; // converting CN into 0-based index
          int t = columnNumber % 26;
          c.append((char)('A' + t));
          columnNumber = columnNumber/26;
       }
       return c.reverse().toString();
    }
}