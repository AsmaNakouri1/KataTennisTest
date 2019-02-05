public class TennisGame {

    private ScoreTennisGame scoreTennisGame;
    private String theWinner;

    private Integer playerOneGameWins;
    private Integer playerTowGameWins;

    private Integer scoreSetPlayerOne;
    private Integer scoreSetPlayerTow;

    public TennisGame() {
        this.scoreTennisGame = new ScoreTennisGame();
        this.theWinner = "the match has not finished yet";

//        this.scoreGamePlayerOne = 0;
//        this.scoreGamePlayerTow = 0;

        this.playerOneGameWins = 0;
        this.playerTowGameWins = 0;
    }

//    public String getScoreGame(){
//        return  scoreTennisGame.getScoreGame();
//    }

    public String getScoreGame() {
        if (isThereAdvantage())
            return getGameScoreWhenAdvantage();

        if(isThereDeuce())
            return "DEUCE _ DEUCE";

        if(isThereWin())
            //
            return getGameScoreWhenWin();


        StringBuilder scoreGame = new StringBuilder();
        scoreGame.append(getScoreGameFromPoint(playerOneGameWins));
        scoreGame.append(" _ ");
        scoreGame.append(getScoreGameFromPoint(playerTowGameWins));
        return scoreGame.toString();
    }

    private String getGameScoreWhenWin() {
        return null;
    }

    private boolean isThereDeuce() {
        return false;
    }

    private boolean isThereWin(){
        return (playerOneGameWins >= 3 || playerTowGameWins >= 3) && (Math.abs(playerOneGameWins - playerTowGameWins) >= 2);
    }


    private boolean isThereAdvantage() {
        return (playerOneGameWins >= 3 && playerTowGameWins >= 3) && (Math.abs(playerOneGameWins - playerTowGameWins) == 1);
    }

    private String getGameScoreWhenAdvantage() {
        return (playerOneGameWins > playerTowGameWins ? "ADV" : "40") + " _ " + (playerTowGameWins > playerOneGameWins ? "ADV" : "40");
    }

    private String getScoreGameFromPoint(Integer point) {
        switch (point) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
//            case 4:
//                return "ADV";
//            case 5:
//                return "DEUCE";
            default:
                return null;
        }
    }

    //    public void firstPlayerWinsOnePoint() {
//        scoreTennisGame.firstPlayerWinsOnePoint();
//    }
    public void firstPlayerWinsOnePoint() {
        playerOneGameWins = playerOneGameWins + 1;

    }

//    public void secondPlayerWinsOnePoint() {
//        scoreTennisGame.secondPlayerWinsOnePoint();
//    }

    public void secondPlayerWinsOnePoint() {
        playerTowGameWins = playerTowGameWins + 1;
    }

    public String getTheWinner() {
        return theWinner;
    }

    public void setScoreTennisGame(ScoreTennisGame scoreTennisGame) {
        this.scoreTennisGame = scoreTennisGame;
    }

    public String getScoreSet() {
        return scoreTennisGame.getScoreSet();
    }

    public String getScoreTieBreak() {
        return scoreTennisGame.getScoreTieBreak();
    }
}
