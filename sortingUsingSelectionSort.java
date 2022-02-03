public class sortingUsingSelectionSort {
public static void printArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}    
public static void main(String[] args) {
    int arr[] = {10,6,3,5,1,9};
    // selection sort
    // time complexity = O(n**2)
    for(int i = 0 ;i<arr.length;i++){
        int smallest = i;
        for (int j = i+1;j<arr.length;j++){
            if (arr[smallest]>arr[j]){
                smallest = j;

            }
        }
    int temp = arr[smallest];
    arr[smallest]=arr[i];
    arr[i]=temp;
    }
    printArray(arr);
}
}
