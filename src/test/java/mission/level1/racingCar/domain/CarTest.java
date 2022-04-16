package mission.level1.racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("이름을 입력하여 자동차를 생성할 수 있다.")
    void createCar() {
        final Car car = new Car("pobi");

        assertThat(car).isEqualTo(new Car("pobi"));
    }

    @Test
    @DisplayName("최소 1이상 최대 5이하의 이름을 입력하지 않고 자동차를 생성한 경우 예외가 발생한다.")
    void createCarToInvalidNameOfLength() {
        assertThatThrownBy(() -> new Car("rookie"));
    }

    @Test
    @DisplayName("자동차는 전진시 1칸 움직일 수 있다.")
    void moveCar() {
        final Car car = new Car("pobi");
        car.move(4);

        assertThat(car).isEqualTo(new Car("pobi", 1));
    }

    @Test
    @DisplayName("같은 위치에 있는 자동차 인지 확인할 수 있다.")
    void validateIsSamePosition() {
        assertThat(new Car("pobi", 4));
    }
}
