import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class TieBreakScoreTest {
    @Test
    public void Should_display_0_1_as_Tie_Break_Score_when_the_second_player_wins_one_point_and_the_the_score_set_was_6_to_6(){
        TennisGame tennisGame = new TennisGame();

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(6);
        scoreSet.setScoreSetPlayerTow(6);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreTieBreak()).isEqualTo("0 _ 1");
    }

    @Test
    public void Should_display_0_0_as_Tie_Break_score_when_the_first_player_wins_one_point_and_the_score_tie_break_was_6_2(){
        TennisGame tennisGame = new TennisGame();

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(6);
        scoreSet.setScoreSetPlayerTow(6);

        TieBreakScore tieBreakScore = new TieBreakScore();
        tieBreakScore.setScoreTieBreakPlayerOne(6);
        tieBreakScore.setScoreTieBreakPlayerTow(2);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreSet(scoreSet);
        scoreTennisGame.setTieBreakScore(tieBreakScore);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreTieBreak()).isEqualTo("0 _ 0");
    }
}