import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ScoreGameTest {

    @Test
    @Parameters({
            "0, 0, 0 _ 0",
            "1, 0, 15 _ 0",
            "2, 0, 30 _ 0",
            "2, 1, 30 _ 15",
            "3, 1, 40 _ 15",
            "3, 2, 40 _ 30",
            "3, 3, 40 _ 40"
    })
    public void should_display_right_(int firstPlayerWins, int secondPlayerWins, String gameScore) {
        TennisGame tennisGame = new TennisGame();

        updateFirstPlayerWins(firstPlayerWins, tennisGame);
        updateSecondPlayerWins(secondPlayerWins, tennisGame);

        assertThat(tennisGame.getScoreGame()).isEqualTo(gameScore);
    }

    @Test
    public void should_display_forty_to_ADV_when_the_game_score_is_three_all_and_the_second_player_wins_one_point() {
        TennisGame tennisGame = new TennisGame();

        updateFirstPlayerWins(3, tennisGame);
        updateSecondPlayerWins(3, tennisGame);

        tennisGame.secondPlayerWinsOnePoint();

        assertThat(tennisGame.getScoreGame()).isEqualTo("40 _ ADV");
    }

    @Test
    public void should_display_forty_to_ADV_when_the_game_score_is_three_all_and_the_first_player_wins_one_point() {
        TennisGame tennisGame = new TennisGame();

        updateFirstPlayerWins(3, tennisGame);
        updateSecondPlayerWins(3, tennisGame);

        tennisGame.firstPlayerWinsOnePoint();

        assertThat(tennisGame.getScoreGame()).isEqualTo("ADV _ 40");
    }

    @Test
    public void should_display_DEUCE_to_DEUCE_when_the_score_is_40_TO_ADV_and_the_first_player_wins_one_point() {
        TennisGame tennisGame = new TennisGame();

        updateFirstPlayerWins(3, tennisGame);
        updateSecondPlayerWins(4, tennisGame);

        tennisGame.firstPlayerWinsOnePoint();

        assertThat(tennisGame.getScoreGame()).isEqualTo("DEUCE _ DEUCE");
    }

    private void updateSecondPlayerWins(int secondPlayerWins, TennisGame tennisGame) {
        for (int i = 0; i < secondPlayerWins; i++) {
            tennisGame.secondPlayerWinsOnePoint();
        }
    }

    private void updateFirstPlayerWins(int firstPlayerWins, TennisGame tennisGame) {
        for (int i = 0; i < firstPlayerWins; i++) {
            tennisGame.firstPlayerWinsOnePoint();
        }
    }

//    @Test
//    public void should_display_ADV_to_forty_when_the_score_is_DEUCE_TO_DEUCE_and_the_first_player_wins_one_point() {
//        TennisGame tennisGame = new TennisGame();
//
//        updateFirstPlayerWins(5, tennisGame);
//        updateSecondPlayerWins(5, tennisGame);
//
//        tennisGame.firstPlayerWinsOnePoint();
//
//        assertThat(tennisGame.getScoreGame()).isEqualTo("ADV _ 40");
//    }
//
//    @Test
//    public void should_display_zero_to_zero_when_the_score_was_ADV_40_and_the_first_player_wins_the_point_and_wins_the_game() {
//        TennisGame tennisGame = new TennisGame();
//
//        ScoreGame scoreGame = new ScoreGame();
//        scoreGame.setScoreGamePlayerOne(4);
//        scoreGame.setScoreGamePlayerTow(3);
//
//        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
//        scoreTennisGame.setScoreGame(scoreGame);
//
//        tennisGame.setScoreTennisGame(scoreTennisGame);
//
//        tennisGame.firstPlayerWinsOnePoint();
//        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
//    }
//
//    @Test
//    public void Should_display_zero_zero_as_score_game_when_the_second_player_wins_one_point_and_the_the_score_set_was_6_to_6() {
//        TennisGame tennisGame = new TennisGame();
//
//        ScoreSet scoreSet = new ScoreSet();
//        scoreSet.setScoreSetPlayerOne(6);
//        scoreSet.setScoreSetPlayerTow(6);
//
//        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
//        scoreTennisGame.setScoreSet(scoreSet);
//
//        tennisGame.setScoreTennisGame(scoreTennisGame);
//
//
//        tennisGame.secondPlayerWinsOnePoint();
//
//        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
//    }
}