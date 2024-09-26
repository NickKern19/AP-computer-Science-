public class P2 {
    public static void main(String[] args) {
        int[] one = {0,2,4,6,8};
        int[] two = new int [one.length];
        for (int i = 0; i < one.length; i++) {
            two[i] = one[one.length -1 -i];
        }
        System.out.print("1: ");
        for (int value : one) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("2: ");
        for (int value : two) {
            System.out.print(value + " ");
        }
    }
}