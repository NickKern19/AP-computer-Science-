java.util.HashSet
public class fun {

    public static int numUnique(int a, int b, int c) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(a);
        uniqueNumbers.add(b);
        uniqueNumbers.add(c);
        return uniqueNumbers.size();
    }
    public static void main(String[] args) {
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
    }
}