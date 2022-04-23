package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {}

    public static int askTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    public static String askCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return Console.readLine();
    }
}
