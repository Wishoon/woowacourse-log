package mission.level1.racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    @DisplayName("여러 자동차의 이름 리스트들과 라운드 값을 통해 랜덤 레이싱 게임을 생성할 수 있다.")
    void createRandomRacingGameWithOfStringListNameAndRoundValue() {
        final List<String> names = List.of("pobi", "jest");
        final int round = 1;

        assertDoesNotThrow(() -> RacingGame.ofRandomMoveRacingGame(names, round));
    }

    @Test
    @DisplayName("랜덤 레이싱 게임을 플레이 할 수 있다.")
    void playWithRandomRacingGame() {
        final List<String> names = List.of("pobi", "jest");
        final int round = 1;
        final RacingGame racingGame = RacingGame.ofRandomMoveRacingGame(names, round);

        assertDoesNotThrow(() -> racingGame.play());
    }

    @Test
    @DisplayName("랜덤 레이싱 게임의 우승자를 구할 수 있다.")
    void getRacingWinner() {
        final List<String> names = List.of("pobi", "jest");
        final int round = 1;
        final RacingGame racingGame = RacingGame.ofRandomMoveRacingGame(names, round);

        assertThat(racingGame.getRacingWinner())
                .containsAll(Arrays.asList(new Car("pobi"), new Car("jest")));
    }

//    @Test
//    @DisplayName("레이싱 게임을 플레이 할 수 있다.")
//    void playRacingGame() {
//        final List<String> names = List.of("pobi", "jest");
//        final int round = 1;
//        final RacingGame racingGame = RacingGame.oFRandomMoveRacingGame(names, round);
//
//        racingGame.play();
//    }
}
