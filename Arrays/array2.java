public class array2 {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

       // First add positives in order
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Then add negatives in order
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to original arr (required by GFG)
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}


