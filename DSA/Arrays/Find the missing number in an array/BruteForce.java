public int missingNumber(int[] nums) {
    int n = nums.length;

    for(int i = 1; i <= n; i++) {
      boolean flag = false;
      for(int j = 0; j < n; j++) {
        if(nums[j] == i) {
          flag = true;
          break;
        }
      }
      if(flag == 0) return i;
    }

    return -1;
  }