public void rotateArrayByOne(int[] nums) {
  int temp = new int[nums.length];

  for(int i=0; i<nums.length; i++) {
    temp[i] = temp[i+1];
  }
  temp[nums.length-1] = nums[0];

  for(int i=0; i<nums.length; i++) {
    nums[i] = temp[i];
  }
}