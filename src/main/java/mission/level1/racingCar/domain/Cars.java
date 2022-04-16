package mission.level1.racingCar.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

    private static final int MINIMUM_CARS = 2;

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        Objects.requireNonNull(cars, "자동차들이 존재하지 않습니다.");
        validateCountOfCars(cars);
        this.cars = cars;
    }

    public static Cars fromCars(List<String> names) {
        return new Cars(names.stream()
                .map(Car::new)
                .collect(Collectors.toList()));
    }

    private void validateCountOfCars(List<Car> cars) {
        if (cars.size() < MINIMUM_CARS) {
            throw new IllegalArgumentException("자동차들의 갯수는 최소 2개 이상이여야 합니다.");
        }
    }

    public void moveAll(NumberGenerateStrategy numberGenerateStrategy) {
        cars.forEach(car -> car.move(numberGenerateStrategy.generateNumber()));
    }

    public List<Car> getWinner() {
        final Car maxPositionCar = findMaxPositionByCar();
        return findWinnerByCars(maxPositionCar);
    }

    private Car findMaxPositionByCar() {
        return cars.stream()
                .max(Car::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("현재 존재하는 자동차가 없습니다."));
    }

    private List<Car> findWinnerByCars(Car maxPositionCar) {
        return cars.stream()
                .filter(car -> car.isSamePosition(maxPositionCar))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cars)) {
            return false;
        }
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
