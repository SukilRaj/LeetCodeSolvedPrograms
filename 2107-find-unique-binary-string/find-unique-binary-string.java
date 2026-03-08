class Solution {
    int n;
    Set<String> numset = new HashSet();
    private String generate(String curr){
        if(curr.length() == n){
            if(!numset.contains(curr)){
                return curr;
            }
            return "";
        }
        String add = generate(curr + "0");
        if(add.length()>0){
            return add;
        }
        return generate(curr + "1");
    }
    public String findDifferentBinaryString(String[] nums) {
        n = nums.length;
        for(String s:nums){
            numset.add(s);
        }
        return generate("");
    }
}