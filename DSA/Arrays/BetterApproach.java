static int findSecondLargestElement(int arr[]) {
    int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > secMax && arr[i] != max) {
        secMax = Math.max(secmax, arr[i]);
      }
    }
    return secMax;
  }