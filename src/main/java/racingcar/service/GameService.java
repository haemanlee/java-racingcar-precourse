package racingcar.service;

import racingcar.domain.Cars;
import racingcar.view.ResultView;

public class GameService {
    public static void start(Cars cars, int playCount) {
        int startCount = 0;

        ResultView.printStartResult();
        while ( startCount != playCount ) {
            cars.play();
            startCount++;
        }
        ResultView.printCars(cars);

    }
}
