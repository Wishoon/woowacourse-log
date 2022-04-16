package mission.level1.racingCar.domain;

import java.util.Random;

public class RandomNumberGenerateStrategy implements NumberGenerateStrategy {

    private static final int MAXIMUM_GENERATE = 10;

    @Override
    public int generateNumber() {
        return new Random().nextInt(MAXIMUM_GENERATE);
    }
}
