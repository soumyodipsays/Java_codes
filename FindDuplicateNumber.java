import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[]args){
        int[] arr = {3,1,3,4,2};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[]arr){
        int i =0;
        while(i< arr.length){
            if(arr[i] != i+1){
                swap(arr, i,arr[i]-1);

                if(arr[i] == arr[arr[i]-1]){
                    i++;
                }
            }
            else{i++;}
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
