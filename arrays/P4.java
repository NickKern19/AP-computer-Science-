import java.util.HashSet;

public class P4 {
    public static boolean hasDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        for (int number : array) {
            if (seen.contains(number)) {
                return true;
            }
            seen.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 2};
        System.out.println("dup array: " + hasDuplicates(arrayWithDuplicates));
        int[] arrayWithoutDuplicates = {1, 2, 3, 4, 5};
        System.out.println("no dup array: " + hasDuplicates(arrayWithoutDuplicates));
    }
}