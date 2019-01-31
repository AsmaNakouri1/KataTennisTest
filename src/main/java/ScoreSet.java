public class ScoreSet {
    private Integer scoreSetPlayerOne;
    private Integer scoreSetPlayerTow;

    public ScoreSet() {
        this.scoreSetPlayerOne = 0;
        this.scoreSetPlayerTow = 0;
    }

    public String getScoreSet() {
        StringBuilder scoreSet = new StringBuilder();
        scoreSet.append(scoreSetPlayerOne.toString());
        scoreSet.append(" _ ");
        scoreSet.append(scoreSetPlayerTow.toString());
        return scoreSet.toString();
    }

    public void firstPlayerAddsOnePointToSetScore() {
        scoreSetPlayerOne = scoreSetPlayerOne+1;
    }

    public void secondPlayerAddsOnePointToSetScore() {
        scoreSetPlayerTow = scoreSetPlayerTow + 1;
    }

    public void setScoreSetPlayerOne(Integer scoreSetPlayerOne) {
        this.scoreSetPlayerOne = scoreSetPlayerOne;
    }

    public void setScoreSetPlayerTow(Integer scoreSetPlayerTow) {
        this.scoreSetPlayerTow = scoreSetPlayerTow;
    }

}
