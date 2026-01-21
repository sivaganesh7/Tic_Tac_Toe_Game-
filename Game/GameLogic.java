package Game;

public class GameLogic {

    public static boolean checkWinner(Board board, char player) {
        // Check Rows
        for (int i = 0; i < 3; i++) {
            if (board.getCell(i, 0) == player &&
                    board.getCell(i, 1) == player &&
                    board.getCell(i, 2) == player) {
                return true;
            }
        }

        // Check Columns
        for (int i = 0; i < 3; i++) {
            if (board.getCell(0, i) == player &&
                    board.getCell(1, i) == player &&
                    board.getCell(2, i) == player) {
                return true;
            }
        }

        // Check Main Diagonal (top-left to bottom-right)
        if (board.getCell(0, 0) == player &&
                board.getCell(1, 1) == player &&
                board.getCell(2, 2) == player) {
            return true;
        }

        // Check Anti-Diagonal (top-right to bottom-left)
        if (board.getCell(0, 2) == player &&
                board.getCell(1, 1) == player &&
                board.getCell(2, 0) == player) {
            return true;
        }

        return false;
    }

    public static char togglePlayer(char currentPlayer) {
        return (currentPlayer == 'X') ? 'O' : 'X';
    }
}
