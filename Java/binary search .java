// Java implementation of recursive Binary Search
class BinarySearch
{
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    int binarySearch(int arr[], int left, int right, int key)
    {
      if(left <= right){
    int mid = (left+right)/2;
    if(arr[mid] == key)
    {
      return mid;
    }
    if(key > mid)
    {
      return binarySearch(arr,mid+1,right,key);
    }
    else
    {
      return binarySearch(arr,left,mid-1,key);
    }
  }
  return -1;
}
  public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int key = 10;
        int result = ob.binarySearch(arr,0,n-1,key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}