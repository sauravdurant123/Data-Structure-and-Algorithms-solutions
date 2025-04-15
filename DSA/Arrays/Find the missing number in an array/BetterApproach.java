public int missingNumber(int[] nums) {
  int n = nums.length;
  int[] hashArr = new int[n+1];

  for(int i = 0; i < n; i++) {
    hashArr[nums[i]]++;
  }  

  for(int i = 0; i < n; i++) {
    if(hashArr[i] == 0) return i;
  }

  return -1; 
}