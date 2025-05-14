public class MissingElement{
    public static void main(String[] args) {
        int[] arr = {0,1};
        int ans = missingElement(arr);
        if(ans == -1){
            System.out.println(arr.length);
        }
        else{
            System.out.println(ans);
        }
    }
    static int missingElement(int[]arr){
        int wrong = -1;
        cyclic(arr);
        for(int j=0;j< arr.length;j++){
            if(arr[j] != j){
                wrong = j;
            }
        }
        return wrong;
    }
    static void cyclic(int[]arr){
        int count = 0;
        while(count<arr.length-1){
            if(arr[count] == arr.length){
                count++;
            }
            if(arr[count] != count){
                swap(arr,count,arr[count]);
            }
            else{
                count++;
            }

        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
