import java.util.Arrays;
public class mancala {
    private static final int BOARD_SIZE = 14;
    private static final int store1 = BOARD_SIZE / 2;
    private static final int store2 = 0;
    private int[] board;

    public mancala(int n) {
        board = new int[BOARD_SIZE];
        for (int i = 1; i <= 6; i++) {
            board[i] = n;
        }
        for (int i = 8; i <= 13; i++) {
            board[i] = n;
        }
    }
   public boolean move(int y) {
        int seedsToDistribute = board[y];
        board[y] = 0;
        int currentIndex = y;
        for (int i = 0; i < seedsToDistribute; i++) {
            currentIndex = (currentIndex + 1) % BOARD_SIZE;
            if (currentIndex != store2) {
                board[currentIndex]++;
            } else {
                seedsToDistribute++;
            }
        }
        boolean inOwnStore = (currentIndex == store1);
        if (currentIndex >= 1 && currentIndex <= 6 && board[currentIndex] == 1) {
            int oppositeHouse = BOARD_SIZE - currentIndex;
            int capturedSeeds = board[oppositeHouse] + 1;
            board[store1] += capturedSeeds;
            board[currentIndex] = 0;
            board[oppositeHouse] = 0;
        }
        return inOwnStore;
    }
    public boolean move2(int y) {
        return move(y);
    }
    public String toString() {
        return Arrays.toString(board);
    }
    public static void main(String[] args) {
        mancala game = new mancala(3);
        System.out.println(game);
        System.out.println(4 + " " + game.move(4));
        System.out.println(game);
        System.out.println(8 + " " + game.move(8));
        System.out.println(game);
        System.out.println();
        game = new mancala(10);
        System.out.println(game);
        System.out.println(6 + " " + game.move(6));
        System.out.println(game);
        System.out.println();
        System.out.println("rules:");
        game = new mancala(10);
        System.out.println(game);
        System.out.println(2 + " " + game.move2(2));
        System.out.println(game);
        System.out.println(4 + " " + game.move2(4));
        System.out.println(game);
    }
}