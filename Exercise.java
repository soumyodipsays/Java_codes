import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int second = 0;
        int stable = 0;
        while (first < m && second < n) {
            if (nums1[first] > nums2[second]) {
                nums1[stable] = nums2[second];
                second++;
                stable++;
            } else {
                nums1[stable] = nums1[first];
                stable++;
                first++;
            }

        }
        if (first < m) {
            for (int i = stable; i < m; i++) {
                nums1[stable] = nums1[first];
                stable++;
                first++;
            }
        } else {
            for (int i = stable; i < m; i++) {
                nums1[stable] = nums1[second];
                stable++;
                second++;
            }
        }
    }
}
