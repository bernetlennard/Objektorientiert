public class Schach {

    public static void main(String[] args) {
        printBoard(getPossibleMovePawn(5, 1, false));
    }

    public static void printBoard(boolean[][] board) {
        for (int y = 0; y < board[0].length; y++) {
            for (boolean[] booleans : board) {
                String symbol = "O";
                if (booleans[y]) {
                    symbol = "X";
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static boolean[][] getPossibleMovePawn(int x, int y, boolean isBlack) {
        boolean[][] resultBoard = new boolean[8][8];
        int stepY;
        if (isBlack) {
            stepY = y - 1;
            if (y == 6) {
                resultBoard[x][stepY] = true;
                stepY = y - 2;
            }
        } else {
            stepY = y + 1;
            if (y == 1) {
                resultBoard[x][stepY] = true;
                stepY = y + 2;
            }
        }
        resultBoard[x][stepY] = true;
        return resultBoard;
    }
}
