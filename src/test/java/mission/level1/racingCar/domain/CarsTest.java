package mission.level1.racingCar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    @DisplayName("여러 자동차를 리스트로 받아 자동차들을 생성할 수 있다.")
    void createCars() {
        final Cars cars = new Cars(Arrays.asList(new Car("pobi"), new Car("jest")));

        assertThat(cars).isEqualTo(new Cars(Arrays.asList(new Car("pobi"), new Car("jest"))));
    }

    @Test
    @DisplayName("여러 자동차의 이름을 리스트로 받아 자동차들을 생성할 수 있다.")
    void createCarsWithOfStringListName() {
        final List<String> names = List.of("pobi", "jest");

        assertThat(Cars.fromCars(names)).isEqualTo(
                new Cars(List.of(new Car("pobi"), new Car("jest")))
        );
    }

    @Test
    @DisplayName("최소 2개 이상의 자동차를 생성하지 않고 자동차들을 생성한 경우 예외가 발생한다.")
    void createCarsToInvalidCount() {
        assertThatThrownBy(() -> new Cars(Arrays.asList(new Car("pobi"))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차들의 갯수는 최소 2개 이상이여야 합니다.");
    }

    @Test
    @DisplayName("여러 자동차들을 움직일 수 있다.")
    void moveAllCars() {
        final Cars cars = new Cars(Arrays.asList(new Car("pobi"), new Car("jest")));
        final Cars expectedCar = new Cars(Arrays.asList(new Car("pobi", 1), new Car("jest", 1)));

        cars.moveAll(new FixedNumberGenerateStrategy());

        assertThat(cars).isEqualTo(expectedCar);
    }

    private class FixedNumberGenerateStrategy implements NumberGenerateStrategy {

        @Override
        public int generateNumber() {
            return 4;
        }
    }

    @Test
    @DisplayName("자동차들 중에서 가장 많이 전진한 우승 자동차를 계산할 수 있다.")
    void calculateWinnerCar() {
        final Cars cars = new Cars(Arrays.asList(new Car("pobi", 1), new Car("jest")));

        assertThat(cars.getWinner()).contains(
                new Car("pobi", 1));
    }

    @Test
    @DisplayName("자동차들 중에서 가장 많이 전진한 우승 자동차들을 계산할 수 있다.")
    void calculateWinnerCars() {
        final Cars cars = new Cars(Arrays.asList(new Car("pobi", 1), new Car("jest", 1)));

        assertThat(cars.getWinner()).containsAll(
                Arrays.asList(new Car("pobi", 1), new Car("jest", 1)));
    }
}
