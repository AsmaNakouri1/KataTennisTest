import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ScoreSetTest {

    @Test
    public void should_display_zero_score_for_the_set_when_the_game_starts(){
        TennisGame tennisGame = new TennisGame();
        assertThat(tennisGame.getScoreSet()).isEqualTo("0 _ 0");
    }
    @Test
    public void should_display_zero_zero_as_set_score_when_the_first_player_wins_one_point_and_the_score_game_was_0_15(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(0);
        scoreGame.setScoreGamePlayerTow(1);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_one_To_Zero_as_set_score_when_the_first_player_wins_one_point_and_the_score_game_was_40_30(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(3);
        scoreGame.setScoreGamePlayerTow(2);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 0");
    }

    @Test
    public void should_display_one_three_as_set_score_when_the_second_player_wins_one_point_and_the_score_game_was_30_40_and_the_score_set_was_1_to_2(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(2);
        scoreGame.setScoreGamePlayerTow(3);

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(1);
        scoreSet.setScoreSetPlayerTow(2);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 3");
    }

    @Test
    public void should_display_one_six_as_set_score_when_the_second_player_wins_one_point_and_the_score_game_was_30_40_and_the_score_set_was_1_to_5(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(2);
        scoreGame.setScoreGamePlayerTow(3);

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(1);
        scoreSet.setScoreSetPlayerTow(5);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.setScoreTennisGame(scoreTennisGame);


        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 6");
    }
    @Test
    public void  should_display_7_5_as_set_score_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_6_to_5(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(4);
        scoreGame.setScoreGamePlayerTow(3);

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(6);
        scoreSet.setScoreSetPlayerTow(5);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.setScoreTennisGame(scoreTennisGame);


        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("7 _ 5");

    }

    @Test
    public void Should_display_6_6_as_score_set_when_the_second_player_wins_one_point_and_the_the_score_set_was_6_to_6(){
        TennisGame tennisGame = new TennisGame();

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(6);
        scoreSet.setScoreSetPlayerTow(6);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.setScoreTennisGame(scoreTennisGame);


        tennisGame.secondPlayerWinsOnePoint();

        assertThat(tennisGame.getScoreSet()).isEqualTo("6 _ 6");
    }

    @Test
    public void Should_display_Player_1_wins_the_match_when_the_first_player_wins_one_point_and_the_score_tie_break_was_6_2(){
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
        assertThat(tennisGame.getScoreSet()).isEqualTo("7 _ 6");
    }
}