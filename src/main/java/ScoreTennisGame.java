public class ScoreTennisGame {

    private ScoreGame scoreGame;
    private ScoreSet scoreSet;
    private TieBreakScore tieBreakScore;

    public ScoreTennisGame() {
        this.scoreGame = new ScoreGame();
        this.scoreSet = new ScoreSet();
        this.tieBreakScore = new TieBreakScore();
    }

    public String getScoreGame() {
    return scoreGame.getScoreGame();
    }

    public void firstPlayerWinsOnePoint() {
    if (scoreSet.scoreSetIsSixToSix()) firstPlayerChangesHisTieBreakScore();
    else firstPlayerAddsPointToScore();
    }

    private void firstPlayerChangesHisTieBreakScore(){
        Boolean gameWin = tieBreakScore.firstPlayerWinsOneTieBreakPoint();
        if(gameWin) scoreSet.firstPlayerAddsOnePointToSetScore();
    }

    private void firstPlayerAddsPointToScore() {
        Boolean gameWin = scoreGame.firstPlayerAddsOnePointToGameScore();
        if (gameWin) scoreSet.firstPlayerAddsOnePointToSetScore();
    }

    public void secondPlayerWinsOnePoint() {
        if(scoreSet.scoreSetIsSixToSix()) secondPlayerChangesHisTieBreakScore();
        else secondPlayerAddsPointToScore();
    }

    private void secondPlayerAddsPointToScore() {
        Boolean gameWin = scoreGame.secondPlayerAddsOnePointToGameScore();
        if(gameWin) scoreSet.secondPlayerAddsOnePointToSetScore();
    }

    public void secondPlayerChangesHisTieBreakScore(){
        Boolean gameWin = tieBreakScore.secondPlayerWinsOneTieBreakPoint();
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

    public String getScoreTieBreak() {
        return tieBreakScore.getScoreTieBreak();
    }

    public void setTieBreakScore(TieBreakScore tieBreakScore) {
        this.tieBreakScore = tieBreakScore;
    }
}
