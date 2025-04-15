public int removeDuplicates(int[] nums) {
  int j = 0;

  for(int i=0; i<nums.length; i++) {
    if(nums[i] != nums[j]) {
      i++;
      nums[i] = nums[j];
    }
  }
  return j+1;    
}