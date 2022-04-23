package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class ResultView {

    private ResultView() {
    }
    public static void printStartResult(){
        System.out.println("실행 결과");
    }
    public static void printCars(Cars cars) {
        System.out.println(cars.getCarsStatus());
    }

    public static void printWinners(Cars cars) {
        final StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자는 ");
        List<Car> winners = cars.isWinners();
        for (int i = 0; i < winners.size(); i++) {
            if(i == 0){
                sb.append(winners.get(i).getCarName());
            } else {
                sb.append(", " + winners.get(i).getCarName());
            }
        }
        sb.append(" 입니다.");
        System.out.println(sb);
    }

}