public static int getSingleElement(int []arr) {
    int max = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }

    int[] hashArr = new int[max + 1];

    for(int i = 0; i < arr.length; i++) {
      hashArr[arr[i]]++;
    }

    for(int i = 0; i < arr.length; i++) {
      if(hashArr[i] == 1) return i;
    }

    return -1;
  }