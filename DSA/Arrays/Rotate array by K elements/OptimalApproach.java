//Right Rotate
public void rotate(int[] nums, int k) {
  int n = nums.length;
  rotate(nums, 0, n-k-1);
  rotate(nums, n-k, n-1);
  rotate(nums, 0, n-1);
}

public void rotate(int[] arr, int start, int end) {
  while(start<=end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

//Left Rotate
public void rotate(int[] nums, int k) {
  int n = nums.length;
  rotate(nums, 0, k-1);
  rotate(nums, k, n-1);
  rotate(nums, 0, n-1);
}

public void rotate(int[] arr, int start, int end) {
  while(start<=end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}