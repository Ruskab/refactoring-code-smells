package tv.codely.student_grades;

import java.util.Arrays;

public enum StepEnum {
    VIDEO(0),
    QUIZ(1),
    EXERCISE(2);

    private final Integer stepTypeCode;

    StepEnum(Integer stepTypeCode) {
        this.stepTypeCode = stepTypeCode;
    }

    public static StepEnum from(Integer stepTypeCode) {
        return Arrays.stream(values()).filter(s -> stepTypeCode.equals(s.stepTypeCode)).findFirst().orElseThrow(RuntimeException::new);
    }

}
