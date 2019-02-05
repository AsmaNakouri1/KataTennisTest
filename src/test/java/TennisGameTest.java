import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {
    @Test
    public void should_display_the_first_player_as_winner_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_5_to_4() {
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(4);
        scoreGame.setScoreGamePlayerTow(3);

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(5);
        scoreSet.setScoreSetPlayerTow(4);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("Player 1 wins the match");
    }

    @Test
    public void Should_display_the_match_has_not_finished_yet_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_5_to_5(){
        TennisGame tennisGame = new TennisGame();

        ScoreGame scoreGame = new ScoreGame();
        scoreGame.setScoreGamePlayerOne(4);
        scoreGame.setScoreGamePlayerTow(3);

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(5);
        scoreSet.setScoreSetPlayerTow(5);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreGame(scoreGame);
        scoreTennisGame.setScoreSet(scoreSet);

        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("the match has not finished yet");
    }

    @Test
    public void Should_display_Player_1_wins_the_match_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_6_to_5(){
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

        assertThat(tennisGame.getTheWinner()).isEqualTo("Player 1 wins the match");
    }

    @Test
    public void Should_display_the_match_has_not_finished_yet_when_the_second_player_wins_one_point_and_the_score_tie_break_was_6_6(){
        TennisGame tennisGame = new TennisGame();

        ScoreSet scoreSet = new ScoreSet();
        scoreSet.setScoreSetPlayerOne(6);
        scoreSet.setScoreSetPlayerTow(6);

        TieBreakScore tieBreakScore = new TieBreakScore();
        tieBreakScore.setScoreTieBreakPlayerOne(6);
        tieBreakScore.setScoreTieBreakPlayerTow(6);

        ScoreTennisGame scoreTennisGame = new ScoreTennisGame();
        scoreTennisGame.setScoreSet(scoreSet);
        scoreTennisGame.setTieBreakScore(tieBreakScore);

        tennisGame.setScoreTennisGame(scoreTennisGame);

        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("the match has not finished yet");
    }

}