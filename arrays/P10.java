public class P10 {

    public static void removeTensInPlace(int[] arr) {
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 10, 10, 2};
        removeTensInPlace(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}