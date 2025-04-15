public int removeDuplicates(int[] nums) {
  HashSet<Integer> set = new HashSet<>();

  for(int i=0; i<nums.length; i++) {
    set.add(nums[i]);
  } 

  int length = set.size();
  int index = 0;

  foreach(int x in set) {
    nums[index] = x;
    index++;
  }

  return length; 
}