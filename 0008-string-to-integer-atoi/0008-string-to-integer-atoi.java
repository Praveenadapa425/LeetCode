class Solution {
    public int myAtoi(String s) {
       int n = s.length(), i = 0;
       while (i < n && s.charAt(i) == ' ') i++; // skip leading spaces

       int sign = 1;
       if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
          if (s.charAt(i) == '-') sign = -1;
          i++;
       }

       long ans = 0;
       while (i < n && Character.isDigit(s.charAt(i))) {
           ans = ans * 10 + (s.charAt(i) - '0');
        
           if ( sign == -1 && ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
           if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
           i++;
       }
       ans *= sign;
       System.out.println(sign);
       if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
       if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
       return (int) ans;
    }
}
