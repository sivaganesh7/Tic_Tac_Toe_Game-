import Game.Board;
import Game.GameLogic;
import Game.Score;
import Game.UIHelper;

public class TicTacToe_Game {
    private Board board;
    private Score score;
    private UIHelper ui;
    private String playerX;
    private String playerO;

    public Main() {
        this.ui = new UIHelper();
        this.board = new Board();
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.run();
    }

    public void run() {
        ui.printWelcomeMessage();

        playerX = ui.getPlayerName('X');
        playerO = ui.getPlayerName('O');

        score = new Score(playerX, playerO);

        boolean playAgain;

        do {
            board.initialize();
            playGame();
            playAgain = ui.askPlayAgain();
        } while (playAgain);

        score.printScores();
        System.out.println("Thanks for playing Tic Tac Toe!");
        ui.closeScanner();
    }

    private void playGame() {
        char currentPlayer = 'X';
        boolean gameEnded = false;
        int moves = 0;

        while (!gameEnded) {
            board.display();
            String currentPlayerName = (currentPlayer == 'X') ? playerX : playerO;

            System.out.println(currentPlayerName + "'s turn (" + currentPlayer + ")");

            while (true) {
                int[] move = ui.getMove();
                int row = move[0];
                int col = move[1];

                if (board.isValidMove(row, col)) {
                    board.makeMove(row, col, currentPlayer);
                    break;
                } else {
                    ui.printInvalidMoveMessage();
                }
            }

            moves++;

            if (GameLogic.checkWinner(board, currentPlayer)) {
                board.display();
                ui.printWinMessage(currentPlayerName);
                score.updateScore(currentPlayer);
                gameEnded = true;
            } else if (moves == 9) {
                board.display();
                ui.printDrawMessage();
                gameEnded = true;
            } else {
                currentPlayer = GameLogic.togglePlayer(currentPlayer);
            }
        }
    }
}
