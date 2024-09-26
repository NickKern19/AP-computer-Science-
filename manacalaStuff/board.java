import java.util.Scanner;
import java.util.Random;
import java.util.function.IntSupplier;

public class board {

    private int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
    private char[] labels = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'}; 
    private Scanner input = new Scanner(System.in);

    private void printSolidLine(int dots, boolean newline) {
        for (int i = 0; i < dots; i++) {
            System.out.print('*');
        }
        if (newline) System.out.println();
    }
    private void printDottedLine(int dots, boolean newline) {
        for (int i =0; i <dots; i++) {
            System.out.print("*     ");
        }
        if (newline) System.out.println('*');
    }
    private void printTopPlayer() {
        for (int i = 13; i > 6; i--) {
            System.out.printf("* %c",labels[i]);
        }
        printDottedLine(1, true);
        for (int i = 13; i > 6; i--) {
            System.out.printf("* %2d", board[i]);
        }
        printDottedLine(1,true);
    }
    private void printBottomPlayer() {
        printBottomLine(1, false);
        for (int 1 = 0; i <= 6; i++); {
             System.out.printf("* %2d", board[i]);
        }
        printSolidLine(1, true);
        printDottedLine(1, false);
        for (int i = 0; i <= 6; i++) {
            System.out.printf("* %c", labels[i]);
        }
        printSolidLine(1, true);
    }
    public void printboard() {
        printSolidLine(41, true);
        printDottedLine(8, true);
        printTopPlayer();
        printDottedLine(8, true);
        printSolidLine(41, true);
        printDottedLine(8, true);
        printBottomPlayer();
        printDottedLine(8, true);
        printSolidLine(41, true);
    }
    int makeMove(Player p) {
        Random random = new Random();
        int retval = 0;
        char chose;
        System.out.print(p.getName() + "choose from pits" + labels[p.getStart()]+ "and" + labels[p.getEnd()] + ": ");
        chose = input.next().toUpperCase().charAt(0);
        retVal = random.nextInt(3);
        System.out.println("the random number being returned is: " + retVal);
        return retVal;
    }
}