public void moveZeroes(int[] nums) {
  int n = nums.length;
  List<Integer> nonZero = new ArrayList<>();

  for(int i=0; i<n; i++) {
    if(nums[i] != 0) nonZero.add(nums[i]);
  }

  int nz = nonZero.size();

  for(int i=0; i<nz; i++) {
    nums[i] = nonZero.get(i);
  }

  for(int i=nz; i<n; i++) {
    nums[i] = 0;
  }
}