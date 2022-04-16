package mission.level1.racingCar.domain;

import java.util.Objects;

public class Name {

    private static final int MINIMUM_LENGTH = 1;
    private static final int MAXIMUM_LENGTH = 5;

    private final String value;

    public Name(String value) {
        validateNameOfEmpty(value);
        validateNameOfLength(value);
        this.value = value;
    }

    private void validateNameOfEmpty(String name) {
        if (name == null) {
            throw new IllegalArgumentException("자동차의 이름은 없을 수 없습니다.");
        }
    }

    private void validateNameOfLength(String name) {
        if (MINIMUM_LENGTH > name.length() || name.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름의 길이는 최소 1이상 최대 5이하여야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Name)) {
            return false;
        }
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
