

    import java.util.*;

    public class Closest
    {
        public static int findClosest(int arr[], int n, int target)
        {
            if (arr[0] >= target)
                return arr[0];

            if (arr[n - 1] <= target)
                return arr[n - 1];

            int i = 0, j = n, mid = 0;
            while (i < j) {
                mid = i + (j - i) / 2;

                if (arr[mid] == target)
                    return arr[mid];

                if (arr[mid] > target) {
                    if (mid > 0 && target > arr[mid - 1])
                        if (target - arr[mid - 1] >= arr[mid] - target) {
                            return arr[mid];
                        } else {
                            return arr[mid - 1];
                        }
                    j = mid;
                } else {
                    if (mid < n - 1 && target < arr[mid + 1])
                        if (target - arr[mid] >= arr[mid + 1] - target) {
                            return arr[mid + 1];
                        } else {
                            return arr[mid];
                        }
                    i = mid + 1;
                }
            }

            return arr[mid];
        }

        public static void main(String[] args) {
            int arr[] = {1, 2, 2, 3, 6, 6, 9, 10, 14};
            int n = arr.length;
            int target = 11;

            System.out.println(findClosest(arr, n, target));
        }
    }

