public int[] unionArray(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    List<Integer> union = new ArrayList<>();

    for(int i=0; i<nums1.length; i++) {
      set.add(nums1[i]);
    }

    for(int j=0; j<nums2.length; j++) {
      set.add(nums2[j]);
    }

    foreach(int el : set) {
      union.add(el);
    }
    
    int[] ans = new int[union.size()];
    for(int i=0; i < union.size(); i++) {
      ans[i] = union.get(i);
    }
    return ans;
  }