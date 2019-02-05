public class TieBreakScore {
    private Integer scoreTieBreakPlayerOne;
    private Integer scoreTieBreakPlayerTow;

    public TieBreakScore() {
        this.scoreTieBreakPlayerOne = 0;
        this.scoreTieBreakPlayerTow = 0;
    }

    public Boolean firstPlayerWinsOneTieBreakPoint() {
        scoreTieBreakPlayerOne = scoreTieBreakPlayerOne +1;
        if (scoreTieBreakPlayerOne >= 7 && scoreTieBreakPlayerOne > scoreTieBreakPlayerTow + 1){
            scoreTieBreakPlayerOne = 0;
            scoreTieBreakPlayerTow = 0;
            return true;
        }
        return false;
    }

    public Boolean secondPlayerWinsOneTieBreakPoint() {
        scoreTieBreakPlayerTow = scoreTieBreakPlayerTow + 1;
        if (scoreTieBreakPlayerTow >= 7 && scoreTieBreakPlayerTow > scoreTieBreakPlayerOne + 1){
            scoreTieBreakPlayerOne = 0;
            scoreTieBreakPlayerTow = 0;
            return true;
        }
        return false;
    }

    public String getScoreTieBreak() {
        StringBuilder scoreTieBreak = new StringBuilder();
        scoreTieBreak.append(scoreTieBreakPlayerOne);
        scoreTieBreak.append(" _ ");
        scoreTieBreak.append(scoreTieBreakPlayerTow);
        return scoreTieBreak.toString();
    }

    public void setScoreTieBreakPlayerOne(Integer scoreTieBreakPlayerOne) {
        this.scoreTieBreakPlayerOne = scoreTieBreakPlayerOne;
    }

    public void setScoreTieBreakPlayerTow(Integer scoreTieBreakPlayerTow) {
        this.scoreTieBreakPlayerTow = scoreTieBreakPlayerTow;
    }
}
