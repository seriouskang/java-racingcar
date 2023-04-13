package study.carrace.step3.presentation;

import study.carrace.step3.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class RaceMonitor {
    private final String WINNER_ANNOUNCE_MESSAGE = "가 최종 우승했습니다.";
    private final List<Car> cars;

    public RaceMonitor(List<Car> cars) {
        this.cars = cars;
    }

    public void showCarsPosition() {
        cars.forEach(car -> showPositionOf(car));
        System.out.println("");
    }

    public void announceWinners() {
        System.out.println(winners(maxNumberOfMove()) + WINNER_ANNOUNCE_MESSAGE);
    }

    private List<String> winners(long maxNumberOfMove) {
        return cars.stream()
                .filter(car -> car.numberOfMove() == maxNumberOfMove)
                .map(car -> car.name())
                .collect(Collectors.toList());
    }

    private long maxNumberOfMove() {
        return cars.stream()
                .map(Car::numberOfMove)
                .mapToLong(l -> l)
                .max()
                .getAsLong();
    }

    private void showPositionOf(Car car) {
        System.out.println(car.currentPosition());
    }
}
