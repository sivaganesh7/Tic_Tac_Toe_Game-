package Game;

import java.util.Scanner;

public class UIHelper {
    private Scanner scanner;

    public UIHelper() {
        this.scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {
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

    public String getPlayerName(char player) {
        System.out.print("Enter Player " + player + " name: ");
        return scanner.nextLine();
    }

    public int[] getMove() {
        System.out.print("Enter row (0-2) and column (0-2): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[] { row, col };
    }

    public boolean askPlayAgain() {
        System.out.print("\nDo you want to play again? (y/n): ");
        char choice = scanner.next().toLowerCase().charAt(0);
        scanner.nextLine(); // clear buffer
        return choice == 'y';
    }

    public void printInvalidMoveMessage() {
        System.out.println("❌ Invalid move. Try again.");
    }

    public void printWinMessage(String playerName) {
        System.out.println("🎉 " + playerName + " wins!");
    }

    public void printDrawMessage() {
        System.out.println("🤝 It's a draw!");
    }

    public void closeScanner() {
        scanner.close();
    }
}
