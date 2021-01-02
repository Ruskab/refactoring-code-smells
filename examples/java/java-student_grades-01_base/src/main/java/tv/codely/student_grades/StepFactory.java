package tv.codely.student_grades;

import java.util.List;

public class StepFactory {

    public static StepType fromPrimitive(Integer typeCode, Integer videoDurationInMinutes, List<Integer> quizQuestions) {
        StepEnum stepEnum = StepEnum.from(typeCode);
        return switch (stepEnum) {
            case QUIZ -> new QuizStepType(quizQuestions);
            case VIDEO -> new VideoStepType(videoDurationInMinutes);
            case EXERCISE -> new ExerciseStepType();
        };
    }

}
