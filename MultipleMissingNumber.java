import java.util.ArrayList;
import java.util.Arrays;

public class MultipleMissingNumber {
    public static void main(String[]args){
        int[] arr = {1,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(MissingNums(arr));
    }

    static void cyclicSort(int[] arr){
        int n = 0;
        while(n<arr.length){
            if(arr[n] != n+1 && arr[n] <= arr.length){
                swap(n,arr[n]-1,arr);
                if(arr[n] == arr[arr[n]-1]){
                    n++;
                }

            }
            else{
                n++;
            }
        }
    }
    static void swap(int first, int second, int[]arr){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
     static ArrayList<Integer> MissingNums(int[]arr){
         ArrayList<Integer> name = new ArrayList<>(5);
        for(int i=0;i< arr.length;i++){
            if(arr[i] != i+1){
                name.add(i+1);
            }
        }
        return name;
     }

}
