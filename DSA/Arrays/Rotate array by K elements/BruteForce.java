//Right Rotate
public void rotate(int[] nums, int k) {
  int n = nums.length;
  int[] = new int[k];
  
  for(int i=n-k; i<n; i++) {
    temp[i-n+k] = nums[i];
  }

  for(int i=n-k-1; i>=0; i--) {
    nums[i+k] = nums[i];
  }

  for(int i=0; i<k; i++) {
    nums[i] = temps[i];
  } 
}

//Left Rotate
public void rotate(int[] nums, int k) {
  int n = nums.length;
  int[] temp = new int[k];
  
  for(int i=0; i<k; i++) {
    temp[i] = nums[i];
  }

  for(int i=0; i<n-k; i++) {
    nums[i] = nums[i+k];
  }

  for(int i=n-k; i<n; i++) {
    nums[i] = temp[i-n+k];
  }
}