public int missingNumber(int[] nums) {
    int n = nums.length;
    int xorN = 0, xor = 0;

    for(int i = 0; i < n; i++) {
      xorN ^= (i+1);
      xor ^= nums[i];
    }

    xorN ^= n;

    return (xorN ^ xor);
}