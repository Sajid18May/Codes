class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int res=0;
        int count=0;
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                         res= nums1[i];
                         count++;
                         break;
                    }
                }
            }
            if(count<1){
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            if(nums1[0]!=nums2[0])
                res= nums1[0]*10+nums2[0];
            else 
                res= nums1[0];
            }
        return res;
    }
}
