package mission.level1.racingCar.domain;

import java.util.Objects;

public class Position implements Comparable<Position> {

    private static final int MINIMUM_POSITION = 0;
    private static final int PLUS_POSITION_VALUE = 1;
    private final int value;

    public Position(int value) {
        validatePosition(value);
        this.value = value;
    }

    private void validatePosition(int value) {
        if (value < MINIMUM_POSITION) {
            throw new IllegalArgumentException();
        }
    }

    public Position plus() {
        return new Position(value + PLUS_POSITION_VALUE);
    }

    @Override
    public int compareTo(Position position) {
        return Integer.compare(this.value, position.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
