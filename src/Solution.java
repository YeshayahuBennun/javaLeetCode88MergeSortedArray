import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        //case 17
        int[] nums17a = {4,5,6,0,0,0};
        int[] nums17b = {1,2,3};
        int m17a = 3;
        int n17b = 3;


        merge(nums17a, m17a, nums17b, n17b);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1[0]<=nums2[0]){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m + n; j++) {
                    if (nums2[i] < nums1[j]) {
                        int aux = nums1[j];
                        nums1[j] = nums2[i];
                        nums1[j + 1] = aux;
                        break;
                    } else {
                        if (nums1[j] == 0) {
                            nums1[j] = nums2[i];
                            break;
                        }
                    }
                }
            }
        }else{
            //TODO
        }
        System.out.println(Arrays.toString(nums1));
    }
}
