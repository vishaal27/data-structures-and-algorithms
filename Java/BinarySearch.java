// Java implementation of recursive Binary Search
/*
   The  BinarySearch--class provides a method for binary
   searching for an integer in a sorted array of integers.
*/
class BinarySearch
    {
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    int binarySearch(int arr[], int left, int right, int key)
    {
      if(left <= right)         //this is line tells us keep going until left is lowerthan or equalto right
    {
    int mid = (left+right)/2;   //ine 10: mid- we calculate so we can divide the list into two pieces.
     
	 if(arr[mid] == key)    //if the mid is equal to our key ,return mid
    {
     		 return mid;
    }
    if(key > mid)
    {
      		return binarySearch(arr,mid+1,right,key); //if the key is greater than mid it search in right
    }
    else
    {
      		return binarySearch(arr,left,mid-1,key);  //if the key is less than mid it search in left
    }
  }
  return -1;
}
public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length; 		//Array.length will give size of array
        int key = 10;
        int result = ob.binarySearch(arr,0,n-1,key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}