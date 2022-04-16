package mission.level1.racingCar.domain;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final NumberGenerateStrategy moveStrategy;
    private Round round;

    public RacingGame(Cars cars, NumberGenerateStrategy moveStrategy, Round round) {
        this.cars = cars;
        this.moveStrategy = moveStrategy;
        this.round = round;
    }

    public static RacingGame ofRandomMoveRacingGame(List<String> names, int value) {
        return new RacingGame(Cars.fromCars(names), new RandomNumberGenerateStrategy(), Round.fromValue(value));
    }

    public void play() {
        while (round.hasNext()) {
            cars.moveAll(moveStrategy);
            round = round.next();
        }
    }

    public List<Car> getRacingWinner() {
        return cars.getWinner();
    }

    @Override
    public String toString() {
        return "RacingGame{" +
                "cars=" + cars +
                ", moveStrategy=" + moveStrategy +
                ", round=" + round +
                '}';
    }
}
