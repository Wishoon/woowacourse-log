package mission.level1.racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

    @Test
    @DisplayName("자동차의 이름을 생성할 수 있다.")
    void createName() {
        assertThat(new Name("pobi")).isEqualTo(new Name("pobi"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "rookie"})
    @DisplayName("자동차의 이름은 최소 1 이상 최대 5이하의 길이를 가지지 않으면 예외가 발생한다.")
    void createNameOfInvalidLength(String value) {
        assertThatThrownBy(() -> new Name(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름의 길이는 최소 1이상 최대 5이하여야 합니다.");
    }

    @Test
    @DisplayName("자동차의 이름은 공백일 수 없습니다.")
    void createNameOfInvalidEmpty() {
        assertThatThrownBy(() -> new Name(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름은 없을 수 없습니다.");
    }
}
