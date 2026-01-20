import java.util.Scanner;
public class TicTacToeGame {
    private static char[][] board = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);

    private static String playerX;
    private static String playerO;

    private static int scoreX = 0;
    private static int scoreO = 0;

    public static void main(String[] args) {
        printWelcomeMessage();
        System.out.print("Enter Player X name: ");
        playerX = scanner.nextLine();
        System.out.print("Enter Player O name: ");
        playerO = scanner.nextLine();
        boolean playAgain;
        do {
            initializeBoard();
            playGame();
            playAgain = askPlayAgain();
        } while (playAgain);

        printFinalScores();
        System.out.println("Thanks for playing Tic Tac Toe!");
    }
    private static void playGame() {
        char currentPlayer = 'X';
        boolean gameEnded = false;
        int moves = 0;
        while (!gameEnded) {
            displayBoard();
            String currentPlayerName = (currentPlayer == 'X') ? playerX : playerO;

            System.out.println(currentPlayerName + "'s turn (" + currentPlayer + ")");
            int row, col;
            while (true) {
                System.out.print("Enter row (0-2) and column (0-2): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (isValidMove(row, col)) {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("❌ Invalid move. Try again.");
                }
            }

            moves++;
            if (checkWinner(currentPlayer)) {
                displayBoard();
                System.out.println("🎉 " + currentPlayerName + " wins!");
                updateScore(currentPlayer);
                gameEnded = true;
            } else if (moves == 9) {
                displayBoard();
                System.out.println("🤝 It's a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    private static void displayBoard() {
        System.out.println("\nCurrent Board:");
        System.out.println("  0   1   2");

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }
//Win Check
    private static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }
        return false;
    }
//Score
    private static void updateScore(char winner) {
        if (winner == 'X') {
            scoreX++;
        } else {
            scoreO++;
        }
    }

    private static void printFinalScores() {
        System.out.println("\n🏆 Final Scores:");
        System.out.println(playerX + " (X): " + scoreX);
        System.out.println(playerO + " (O): " + scoreO);
    }
//Replay
    private static boolean askPlayAgain() {
        System.out.print("\nDo you want to play again? (y/n): ");
        char choice = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine(); 
        return choice == 'y';
    }

    private static void printWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("        TIC TAC TOE GAME         ");
        System.out.println("=================================");
        System.out.println("Instructions:");
        System.out.println("- Two players take turns (X and O)");
        System.out.println("- Enter row and column (0 to 2)");
        System.out.println("- First to get 3 in a row wins");
        System.out.println("- Example input: 1 2");
        System.out.println("=================================\n");
    }
}
