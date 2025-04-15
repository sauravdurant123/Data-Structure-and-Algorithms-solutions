public boolean check(int[] nums) {
  int n = nums.length;

  for(int i=0; i<n; i++) {
    for(int j=i+1; j<n; j++) {
      if(nums[j] < nums[i]) return false;
    }
  }
  return true;
}