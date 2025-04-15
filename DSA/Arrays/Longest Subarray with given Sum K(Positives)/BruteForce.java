public static int getLongestSubarray(int []a, long k) {
    int maxLength = Integer.MIN_VALUE;

    for(int i = 0; i < a.length; i++) {
      for(int j = i; j < a.length; j++) {
        int sum = 0;
        for(int k = i; k <= j; k++) {
          sum += a[k];
        }
        if(sum == k) maxLength = Math.max(maxLength, j - i + 1);
      }
    }
    return maxLength;
  }