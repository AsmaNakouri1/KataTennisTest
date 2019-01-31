public class ScoreGame {
    private Integer scoreGamePlayerOne;
    private Integer scoreGamePlayerTow;

    public ScoreGame() {
        this.scoreGamePlayerOne = 0;
        this.scoreGamePlayerTow = 0;
    }

    public void firstPlayerAddsOnePointToGameScore() {
        if(scoreGamePlayerOne>=3) firstPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
        else
            scoreGamePlayerOne = scoreGamePlayerOne + 1;    }

    private void firstPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints() {
        if(scoreGamePlayerOne>scoreGamePlayerTow)
            firstPlayerWinsOneGame();
        else
            firstPlayerChangesHisGameScore();
    }

    private void firstPlayerWinsOneGame() {
        scoreGamePlayerOne = 0;
        scoreGamePlayerTow =0;
    }

    private void firstPlayerChangesHisGameScore() {
        if(scoreGamePlayerOne == 3 && scoreGamePlayerTow ==4) {
            scoreGamePlayerOne = 5;
            scoreGamePlayerTow =5;
        }else{
            scoreGamePlayerOne = 4;
            scoreGamePlayerTow =3;
        }
    }


    public void secondPlayerAddsOnePointToGameScore() {
        if(scoreGamePlayerTow>=3) secondPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
        else
            scoreGamePlayerTow = scoreGamePlayerTow + 1;
    }

    private void secondPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints() {
        if(scoreGamePlayerTow>scoreGamePlayerOne)
            secondPlayerWinsOneGame();
        else
            secondPlayerChangesHisGameScore();

    }

    private void secondPlayerChangesHisGameScore() {
        if(scoreGamePlayerOne == 4 && scoreGamePlayerTow ==3) {
            scoreGamePlayerOne = 5;
            scoreGamePlayerTow =5;
        }else{
            scoreGamePlayerOne = 3;
            scoreGamePlayerTow =4;
        }

    }

    private void secondPlayerWinsOneGame() {
        scoreGamePlayerOne = 0;
        scoreGamePlayerTow =0;
    }


    public String getScoreGame() {
        StringBuilder scoreGame = new StringBuilder();
        scoreGame.append(getScoreGameFromPoint(scoreGamePlayerOne));
        scoreGame.append(" _ ");
        scoreGame.append(getScoreGameFromPoint(scoreGamePlayerTow));
        return scoreGame.toString();
    }

    public String getScoreGameFromPoint(Integer point){
        switch (point) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            case 4:
                return "ADV";
            case 5:
                return "DEUCE";
            default:
                return null;
        }
    }

    public void setScoreGamePlayerOne(Integer scoreGamePlayerOne) {
        this.scoreGamePlayerOne = scoreGamePlayerOne;
    }

    public void setScoreGamePlayerTow(Integer scoreGamePlayerTow) {
        this.scoreGamePlayerTow = scoreGamePlayerTow;
    }
}

