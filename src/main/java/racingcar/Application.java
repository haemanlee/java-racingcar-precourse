package racingcar;

import racingcar.domain.Cars;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
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
        int playCount;
        while (true) {
            try {
                playCount = InputView.askTryCount();
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        GameService.start(cars, playCount);

        ResultView.printWinners(cars);
    }
}
