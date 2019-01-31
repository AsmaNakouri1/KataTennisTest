public class TennisGame {

    private ScoreTennisGame scoreTennisGame;

    public TennisGame() {
        this.scoreTennisGame = new ScoreTennisGame();
    }

    public String getScoreTennisGame(){
        return  scoreTennisGame.getScoreGame();
    }

    public void firstPlayerWinsOnePoint() {
        scoreTennisGame.firstPlayerAddsOnePointToScore();
    }

    public void secondPlayerWinsOnePoint() {
        scoreTennisGame.secondPlayerAddsOnePointToScore();
    }

    public void setScoreTennisGame(ScoreTennisGame scoreTennisGame){
        this.scoreTennisGame = scoreTennisGame;
    }
}
