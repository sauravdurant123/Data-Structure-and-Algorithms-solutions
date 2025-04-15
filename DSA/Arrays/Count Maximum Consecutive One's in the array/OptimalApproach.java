static int findMaxConsecutiveOnes(int nums[]) {
    int cnt = 0, maxCnt = 0;

    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 1) cnt++;
      else cnt = 0;
      maxCnt = Math.max(maxCnt, cnt);
    }

    return maxCnt;
  }