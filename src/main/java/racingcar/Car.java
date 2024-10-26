package racingcar;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하로 설정해주세요.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }
    }
}
