package tv.codely.student_grades;

public class ExerciseStepType implements StepType {

    private static final int EXERCISE_STEP_DURATION_ESTIMATION_IN_MINUTES = 30;

    @Override
    public int estimatedCompletionMinutes() {
        return EXERCISE_STEP_DURATION_ESTIMATION_IN_MINUTES;
    }

}
