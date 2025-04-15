public int[] unionArray(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> union = new ArrayList<>();

    for(int i=0; i<nums1.length; i++) {
      map.add(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
    }

    for(int j=0; j<nums2.length; j++) {
      map.add(nums2[j], map.getOrDefault(nums2[j], 0) + 1);
    }

    foreach(int el : map.keySet()) {
      union.add(el);
    }
    
    int[] ans = new int[union.size()];
    for(int i=0; i < union.size(); i++) {
      ans[i] = union.get(i);
    }
    return ans;
  }