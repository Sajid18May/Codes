class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
              arr.add(nums[i]);
        }
        //int[] nums=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);

        }
        int k=arr.size();
        return k;
    }
}
