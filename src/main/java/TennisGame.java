public class TennisGame {

    private ScoreTennisGame scoreTennisGame;

    public TennisGame() {
        this.scoreTennisGame = new ScoreTennisGame();
    }

    public String getScoreTennisGame(){
        return  scoreTennisGame.getScoreGame();
    }

    public void firstPlayerWinsOnePoint() {
        scoreTennisGame.firstPlayerWinsOnePoint();
    }

    public void secondPlayerWinsOnePoint() {
        scoreTennisGame.secondPlayerWinsOnePoint();
    }

    public void setScoreTennisGame(ScoreTennisGame scoreTennisGame){
        this.scoreTennisGame = scoreTennisGame;
    }

    public String getScoreSet() {
        return scoreTennisGame.getScoreSet();
    }
}
