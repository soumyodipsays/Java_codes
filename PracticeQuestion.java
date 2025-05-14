import java.util.Arrays;

public class PracticeQuestion {
    public static void main(String[] args) {
        int[] myarr = {5,4,3,2,1};
        cyclic(myarr);
        System.out.println(Arrays.toString(myarr));
    }
    static void bubble(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    static void selection(int[]arr){
        for(int i=0;i< arr.length;i++){
            int elemeantIdx = arr.length-1-i;
            int max = findMax(arr,0,elemeantIdx);
            if(max!= elemeantIdx){
                swap(arr,max,elemeantIdx);
            }
        }
    }
    static void insertion(int[]arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void cyclic(int[]arr){
        int count = 0;
      while(count < arr.length){
          if(arr[count] != count+1){
              swap(arr,count,arr[count]-1);
          }
          else{count++;}
      }
    }

    static int findMax(int[]arr,int start,int end){
        int max = 0;
        for(int j = start;j<=end;j++){
            if(arr[j]>arr[max]){
                max = j;
            }
        }
        return max;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
