package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Controller {
    public static void start(Cars cars, int playCount) {
        int startCount = 0;

        ResultView.printStartResult();
        while ( startCount != playCount ) {
            cars.play();
            startCount++;
        }
        ResultView.printCars(cars);
    }

    public static int makePlayCount() {
        int playCount;
        while (true) {
            try {
                playCount = InputView.askTryCount();
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        return playCount;
    }

    public static Cars makeCars() {
        Cars cars;
        while (true){
            try {
                String carList = InputView.askCars();
                cars = new Cars(carList);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return cars;
    }
}
