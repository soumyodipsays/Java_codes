import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]array = {5,3,2,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("hello world");
    }
}
