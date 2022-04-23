package racingcar;

import racingcar.domain.Cars;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String carList = InputView.askCars( );
        Cars cars = new Cars(carList);

        int playCount = InputView.askTryCount();

        GameService.start(cars, playCount);

        ResultView.printWinners(cars);
    }
}
