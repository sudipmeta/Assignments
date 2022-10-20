package recursion;

public class Search{
    static int linearSearch(int[] arr, int value, int i) {
        if(i >= arr.length)
            return -1;
        else if(arr[i] == value)
            return i;
            
        return linearSearch(arr,value,++i);
    }

    static int binarySearch(int[] arr, int value, int low, int high) {        
        int mid = (low + high)/2;
        if(arr[mid] == value) 
            return mid;
        if(value < arr[mid]) {
            return binarySearch(arr, value, low, mid);
        } 
        else if(value > arr[mid]) {
            return binarySearch(arr, value, mid+1, high);
        } 
                
        return mid;
    }
    
    public static void main(String[] args) {
        int arr[] = {0,4,8,3,1,0,7,9};
        int arr1[] = {0,1,2,5,6,7,8,9};
        
        System.out.println(linearSearch(arr,7,0));
        System.out.println(binarySearch(arr1,7,0,arr1.length));
    }
    
}