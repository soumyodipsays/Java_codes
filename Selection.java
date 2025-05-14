import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[]array = {5,4,2,1};
        selection(array);
        System.out.println(Arrays.toString(array));
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = MaxElement(arr,last);
            swap(arr,last,maxIndex);
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int MaxElement(int[]arr,int end){
        int maxIndex = 0;
        for(int i=0;i<=end;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex= i;
            }
        }
        return maxIndex;
    }
}
