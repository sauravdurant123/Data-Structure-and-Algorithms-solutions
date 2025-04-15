public int[] unionArray(int[] nums1, int[] nums2) {
    List<Integer> union = new ArrayList<>();
    int i=0, j=0, n=nums1.length, m=nums2.length;

    while(i<n && j<m) {
      if(nums1[i] <= nums2[j]) {
        if(union.size == 0 || union.get(union.size()-1) != nums1[i]) 
          union.add(nums1[i])
        i++;
      }
      else {
        if(union.size == 0 || union.get(union.size()-1) != nums2[j]) 
          union.add(nums2[j])
        j++;
      }
    }

    while(i<n) {
      if(union.get(union.size()-1) != nums1[i]) 
          union.add(nums1[i])
        i++;
    }

    while(j<m) {
      if(union.get(union.size()-1) != nums2[j]) 
          union.add(nums2[j])
        j++;
    }
    
    int[] ans = new int[union.size()];
    for(int i=0; i < union.size(); i++) {
      ans[i] = union.get(i);
    }
    return ans;
  }