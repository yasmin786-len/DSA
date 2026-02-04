import java.util.Arrays;

public class secondLargest {
    public static int betterFindSLargest(int[] arr) {
        Arrays.sort(arr);
        //find unique second largest
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i-1]!=arr[i]){
                return arr[i-1];
            }
        }
        return arr[arr.length - 2];
    }
    public static int optimalApproach(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {34, 67, 23, 89, 12, 90,90,89, 45};
        System.out.println("Better Approach:");
        int slargest=betterFindSLargest(arr);
        System.out.println("The second largest element in the array is: " + slargest);
        slargest=optimalApproach(arr);
        System.out.println("Optimal Approach:");
        System.out.println("The second largest element in the array is: " + slargest);
    }    
}
