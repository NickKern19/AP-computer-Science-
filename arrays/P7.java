public class P7 {

    public static void main(String[] args) {
        int[] numbers = {2,4,5,7,8,84,8};

        boolean containsOneOrThree = containsOneOrThree(numbers);
        System.out.println(containsOneOrThree);
    }
    public static boolean containsOneOrThree(int[] array) {
        for (int num : array) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;  
    }
}