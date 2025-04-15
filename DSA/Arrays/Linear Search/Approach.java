static int search(int arr[],int n,int num) {
  for(int i=0; i<n; i++) {
    if(arr[i] == num) return true;
  }
  return false;
}