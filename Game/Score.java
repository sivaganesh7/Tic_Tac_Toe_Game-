package Game;

public class Score {
    private String playerXName;
    private String playerOName;
    private int scoreX;
    private int scoreO;

    public Score(String playerXName, String playerOName) {
        this.playerXName = playerXName;
        this.playerOName = playerOName;
        this.scoreX = 0;
        this.scoreO = 0;
    }

    public void updateScore(char winner) {
        if (winner == 'X') {
            scoreX++;
        } else if (winner == 'O') {
            scoreO++;
        }
    }

    public void printScores() {
        System.out.println("\n🏆 Final Scores:");
        System.out.println(playerXName + " (X): " + scoreX);
        System.out.println(playerOName + " (O): " + scoreO);
    }

    public int getScoreX() {
        return scoreX;
    }

    public int getScoreO() {
        return scoreO;
    }
}
