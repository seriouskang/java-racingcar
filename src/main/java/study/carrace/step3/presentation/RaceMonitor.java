package study.carrace.step3.presentation;

import study.carrace.step3.application.RaceManager;

import static study.carrace.step3.presentation.PromptMessage.*;

public class RaceMonitor {
    private final RaceManager raceManager;

    public RaceMonitor(RaceManager raceManager) {
        this.raceManager = raceManager;
    }

    public void showCarsPositionHistory() {
        announceRaceResult();
        System.out.println(raceManager.carsPositionHistory());
    }

    public void announceWinners() {
        System.out.println(raceManager.winners() + WINNER_ANNOUNCE_MESSAGE.getMessage());
    }

    private void announceRaceResult() {
        System.out.println(RACE_RESULT_ANNOUNCE_MESSAGE.getMessage());
    }
}
