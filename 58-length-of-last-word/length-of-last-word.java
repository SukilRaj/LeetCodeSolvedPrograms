class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end>=0 && s.charAt(end)==' '){
            end--;
        }
        int st = end;
        while(st>=0 && s.charAt(st)!=' '){
            st--;
        }
        return end - st;
    }
}
