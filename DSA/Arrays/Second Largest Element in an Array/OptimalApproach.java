static int findSecondLargestElement(int arr[]) {
    int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max) {
        secMax = max;
        max = arr[i];
      }
      else if(arr[i] > secMax && arr[i] != max) {
        secMax = arr[i];
      }
    }
    return secMax;
  }