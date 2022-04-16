package mission.level1.racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RoundTest {

    @Test
    @DisplayName("레이싱 게임의 각 라운드를 생성할 수 있다.")
    void createRound() {
        assertThat(Round.fromValue(3)).isEqualTo(Round.fromValue(3));
    }

    @Test
    @DisplayName("각 라운드는 1이하의 값으로 생성할 경우 예외가 발생한다.")
    void createRoundToInvalidValue() {
        assertThatThrownBy(() -> Round.fromValue(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("라운드의 값은 최소 1 이상이여야 합니다.");
    }

    @ParameterizedTest
    @DisplayName("다음 라운드가 존재할 경우 `true`값을 반환할 수 있다..")
    @CsvSource(value = {"1, true"})
    void validateHasNextToRound(int value, boolean flag) {
        final Round round = Round.fromValue(value);

        assertThat(round.hasNext()).isEqualTo(flag);
    }

    @Test
    @DisplayName("라운드 값을 감소시킬 수 있습니다.")
    void decreaseWithRound() {
        final Round round = Round.fromValue(1);

        final Round newRound = round.next();

        assertThat(newRound.getValue()).isEqualTo(0);
    }
}
