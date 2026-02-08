class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <=1) return s;
    int maxlen = 1;
    String maxstr = s.substring(0,1);

    for(int i = 0;i<s.length();i++){
        for(int j = 1 + maxlen; j <= s.length();j++){
            if(j-i > maxlen && ispalindrome(s.substring(i,j))){
                maxlen = j-i;
                maxstr = s.substring(i,j);
            }
        }
    }
         return maxstr;
    }
    private boolean ispalindrome(String str){
        int l = 0, r = str.length() - 1;

        while(l<=r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}