/*
Linear Search
This algorithm searches for a element let say- x in a array in linear manner.
It compares every element of the array with x using for loop
if array contains element x ,then it returns the index of x in the array,if x is not present in the array
it returns -1
*/
 
 class LinearSearch {
 
    public static int linerSearch(int[] arr, int key) //passing two parametres(function)
{
    int size = arr.length;
        for(int i=0;i<size;i++)  //Using loop to check whether the entered number is found in the list or not
	{
            if(arr[i] == key){
                return i;
           }
        }
        return -1;
    }
     
    public static void main(String a[]){
         
        int[] arr1= {23,45,21,55,234,1,66,90};
        int searchKey = 66;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
        int[] arr2= {123,445,24,595,2134,41,304,190};
        searchKey = 24;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));
    }
}