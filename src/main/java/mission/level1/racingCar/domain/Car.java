package mission.level1.racingCar.domain;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private static final int MINIMUM_POSITION = 4;

    private final Name name;
    private Position position;

    public Car(String name) {
        this(new Name(name), new Position(0));
    }

    public Car(String name, int position) {
        this(new Name(name), new Position(position));
    }

    public Car(Name name, Position position) {
        Objects.requireNonNull(name, "이름 값이 존재하지 않습니다.");
        Objects.requireNonNull(position, "위치 값이 존재하지 않습니다.");
        this.name = name;
        this.position = position;
    }

    public void move(int value) {
        if (value >= MINIMUM_POSITION) {
            position = position.plus();
        }
    }

    public boolean isSamePosition(Car car) {
        return this.position.equals(car.position);
    }

    @Override
    public int compareTo(Car car) {
        return this.position.compareTo(car.position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
