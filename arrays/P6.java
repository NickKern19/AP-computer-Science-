public class P6 {

    public static void main(String[] args) {
        int[] numbers = {1,4,67,596,1045};
        printDifference(numbers);
    }

    public static void printDifference(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Does not work");
            return;
        }

        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int difference = max - min;
        System.out.println("The difference is: " + difference);
    }
}