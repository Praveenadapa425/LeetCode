class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] match = new boolean[sLen + 1][pLen + 1];
        match[0][0] = true;

        for (int j = 2; j <= pLen; j++) {
            if (p.charAt(j - 1) == '*' && match[0][j - 2]) {
                match[0][j] = true;
            }
        }

        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    match[i][j] = match[i - 1][j - 1];
                } else if (pc == '*') {
                    match[i][j] = match[i][j - 2];
                    char prev = p.charAt(j - 2);
                    if (prev == '.' || prev == sc) {
                        match[i][j] = match[i][j] || match[i - 1][j];
                    }
                } else {
                    match[i][j] = false;
                }
            }
        }

        return match[sLen][pLen];
    }
}
