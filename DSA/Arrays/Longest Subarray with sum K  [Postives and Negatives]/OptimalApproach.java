public static int getLongestSubarray(int []a, long k) {
    Map<Integer, Integer> preSumMap = new HashMap<>();
    int maxLength = Integer.MIN_VALUE;
    int sum = 0;

    for(int i = 0; i < a.length; i++) {
      sum += a[i];

      if(sum == k) maxLength = Math.max(maxLength, i + 1);

      int rem = sum - k;

      if(preSumMap.containsKey(rem)) {
        maxLength = Math.max(maxLength, i - preSumMap.get(rem));
      }

      if(!preSumMap.containsKey(sum)) {
        preSumMap.put(sum, i);
      }
    }
  }