class Solution {
    public int trap(int[] height) {
        int[] l = new int[height.length];
        int[] r = new int[height.length];
        int max = -1;
        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max=height[i];
            }
            l[i]=max;
        }
        max = -1;
        for(int i = height.length - 1;i>=0;i--){
            if(height[i]>=max){
                max = height[i];
            }
            r[i] = max;
        }
        int tot = 0;
        for(int i=0;i<height.length;i++){
            tot+=Math.min(l[i],r[i]) - height[i];
        }
        return tot;
        
    }
}