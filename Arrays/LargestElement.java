import java.util.Arrays;

class LargestElement{
    public static int findLargest(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int betterFindLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int bruteForceFindLargest(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            boolean isLargest = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest) return arr[i];
        }
        return -1; // should never reach
    }
    public static void main(String[] args) {
        int arr[]={34, 67, 23, 89, 12, 90, 45};
        int largest=findLargest(arr);
        System.out.println("Optimal Approach:");
        System.out.println("The largest element in the array is: " + largest);
        largest=bruteForceFindLargest(arr);
        System.out.println("Brute Force Approach:");
        System.out.println("The largest element in the array is: " + largest);
        largest=betterFindLargest(arr);
        System.out.println("Better Approach:");
        System.out.println("The largest element in the array is: " + largest);
    }
    
    }


    // Time Complexity
    //Brute Force=O(n^2)
    //Optimal=O(n)
    //better=O(n log n)
