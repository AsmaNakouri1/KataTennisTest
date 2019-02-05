import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {


    @Test
    public void name() {
        TennisGame tennisGame = new TennisGame();

        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
    }
}
