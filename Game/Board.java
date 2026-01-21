package Game;
public class Board {
    private static final int SIZE = 3;
    private char[][] board;
    public Board() {
        this.board = new char[SIZE][SIZE];
        initialize();
    }
    public void initialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public void display() {
        System.out.println("\nCurrent Board:");
        System.out.println("  0   1   2");

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1)
                    System.out.print(" | ");
            }
            System.out.println();
            if (i < SIZE - 1)
                System.out.println("  ---------");
        }
        System.out.println();
    }

    public void makeMove(int row, int col, char player) {
        if (isValidMove(row, col)) {
            board[row][col] = player;
        }
    }
    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE &&
                col >= 0 && col < SIZE &&
                board[row][col] == ' ';
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public char[][] getBoard() {
        return board;
    }
}
