package mission.level1.racingCar.domain;

import java.util.Iterator;
import java.util.Objects;

public class Round implements Iterator<Round> {

    private static final int MINIMUM_ROUND = 1;
    private final int value;

    private Round(int value) {
        this.value = value;
    }

    public static Round fromValue(int value) {
        validateValueOfRound(value);
        return new Round(value);
    }

    private static void validateValueOfRound(int value) {
        if (value < MINIMUM_ROUND) {
            throw new IllegalArgumentException("라운드의 값은 최소 1 이상이여야 합니다.");
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean hasNext() {
        return this.value != 0;
    }

    @Override
    public Round next() {
        return new Round(this.value - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Round)) {
            return false;
        }
        Round round = (Round) o;
        return value == round.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Round{" +
                "value=" + value +
                '}';
    }
}
