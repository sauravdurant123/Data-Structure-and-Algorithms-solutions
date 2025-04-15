public static int getLongestSubarray(int []a, long k) {
    int sum = 0, maxLength = Integer.MIN_VALUE;
    int left = 0, right = 0;

    while(right < a.length) {
      sum += a[right];

      if(sum == k) maxLength = Math.max(maxLength, right - left + 1);

      while(left <= right && sum > k) {
        sum -= sum[left];
        left--;
      }

      right++;
    }

    return maxLength;
  }