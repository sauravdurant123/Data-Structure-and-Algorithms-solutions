public static int getSingleElement(int []arr) {
    for(int i = 0; i < arr.length; i++) {
      int cnt = 0;
      for(int j = 0; j < arr.length; j++) {
        if(arr[j] == arr[i]) cnt++;
      }
      if(cnt == 1) return arr[i];
    }

    return -1;
  }