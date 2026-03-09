/*class Solution {
    public int[] sortArray(int[] nums) {

        int temp=0;
        int minindex= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            minindex=i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[minindex] > nums[j]){
                    minindex = j;
                }

            }
            
            temp = nums[minindex];
            nums[minindex]= nums[i];
            nums[i]= temp;


        }
        return nums;
    }
}*/