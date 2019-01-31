public class ScoreTennisGame {

    private ScoreGame scoreGame;

    public ScoreTennisGame() {
        this.scoreGame = new ScoreGame();
    }

    public String getScoreGame() {
    return scoreGame.getScoreGame();
    }

    public void firstPlayerAddsOnePointToScore() {
        scoreGame.firstPlayerAddsOnePointToGameScore();
    }

    public void secondPlayerAddsOnePointToScore() {
        scoreGame.secondPlayerAddsOnePointToGameScore();
    }

    public void setScoreGame(ScoreGame scoreGame) {
        this.scoreGame = scoreGame;
    }
}
