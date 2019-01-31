public class ScoreTennisGame {

    private ScoreGame scoreGame;
    private ScoreSet scoreSet;

    public ScoreTennisGame() {
        this.scoreGame = new ScoreGame();
        this.scoreSet = new ScoreSet();
    }

    public String getScoreGame() {
    return scoreGame.getScoreGame();
    }

    public void firstPlayerWinsOnePoint() {
        Boolean gameWin = scoreGame.firstPlayerAddsOnePointToGameScore();
        if(gameWin) scoreSet.firstPlayerAddsOnePointToSetScore();
    }

    public void secondPlayerWinsOnePoint() {
        Boolean gameWin = scoreGame.secondPlayerAddsOnePointToGameScore();
        if(gameWin) scoreSet.secondPlayerAddsOnePointToSetScore();
    }

    public void setScoreGame(ScoreGame scoreGame) {
        this.scoreGame = scoreGame;
    }

    public String getScoreSet() {
        return scoreSet.getScoreSet();
    }

    public void setScoreSet(ScoreSet scoreSet) {
        this.scoreSet = scoreSet;
    }
}
