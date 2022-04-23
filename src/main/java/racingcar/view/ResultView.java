package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

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

        for (Car car : cars.isWinners()){
            extractWinnerCars(sb, car);
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb);
    }

    /**
     * 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
     */
    private static void extractWinnerCars(StringBuilder sb, Car car) {
        if(sb.length() == 0){
            sb.append(car.getCarName());
        } else {
            sb.append(", " + car.getCarName());
        }
    }
}
